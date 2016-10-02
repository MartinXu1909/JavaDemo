/* 
 生产者和消费者问题是线程模型中的经典问题：
 
 生产者和消费者在同一时间段内共用同一个存储空间，如下图所示，
 (Producer)--write-->[Shared Buffer]--read-->(Consumer)
 
 生产者向空间里存放数据，而消费者取用数据，如果不加以协调可能会出现以下情况：

 存储空间已满，而生产者占用着它，消费者等着生产者让出空间从而去除产品，
 生产者等着消费者消费产品，从而向空间中添加产品。互相等待，从而发生死锁。

以下实例演示了如何通过线程解决生产者/消费者问题： 
*/

public class ProducerConsumerTest{
	public static void main(String[] args){
		CubbyHole c = new CubbyHole();
		Producer p1 = new Producer(c, 1);
		Consumer c1 = new Consumer(c, 1);
		p1.start();
		c1.start();
	}
}
class CubbyHole{
	private int contents;
	private boolean available = false;
	public synchronized int get(){
		while(available == false){
			try{
				wait();
			}
			catch (InterruptedException e){
			}
		}
		available = false;
		notifyAll();
		return contents;
	}
	public synchronized void put(int value){
		while(available == true){
			try{
				wait();
			}
			catch(InterruptedException e){
			}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}
class Consumer extends Thread{
	private CubbyHole cubbyhole;
	private int number;
	public Consumer(CubbyHole c, int number){
		cubbyhole = c;
		this.number = number;
	}
	public void run(){
		int value = 0;
		for(int i = 0; i < 10; i++){
			value = cubbyhole.get();
			System.out.println("消费者 #" + this.number + " got: " + value);
		}
	}
}
class Producer extends Thread{
	private CubbyHole cubbyhole;
	private int number;
	public Producer(CubbyHole c, int number){
		cubbyhole = c;
		this.number = number;
	}
	public void run(){
		for(int i = 0; i < 10; i++){
			cubbyhole.put(i);
			System.out.println("生产者 #" + this.number + " put: " + i);
			try{
				sleep((int)(Math.random() * 100));
			}catch(InterruptedException e){ }
		}
	}
}
/* 
生产者 #1 put: 0
消费者 #1 got: 0
生产者 #1 put: 1
消费者 #1 got: 1
生产者 #1 put: 2
消费者 #1 got: 2
消费者 #1 got: 3
生产者 #1 put: 3
生产者 #1 put: 4
消费者 #1 got: 4
生产者 #1 put: 5
消费者 #1 got: 5
消费者 #1 got: 6
生产者 #1 put: 6
生产者 #1 put: 7
消费者 #1 got: 7
生产者 #1 put: 8
消费者 #1 got: 8
消费者 #1 got: 9
生产者 #1 put: 9
 */