/* 
 ͨ���̳� Thread �ಢʹ�� currentThread.getName() ����������̵߳�״̬
*/
class MyThread extends Thread{
	boolean waiting  = true;
	boolean ready = false;
	MyThread(){
	}
	public void run(){
		String thrName = Thread.currentThread().getName();
		System.out.println(thrName + " starting.");
		while(waiting)
			System.out.println("waiting: " + waiting);
			System.out.println("waiting...");
			startWait();
			try{
				Thread.sleep(1000);
			}
			catch(Exception exc){
				System.out.println(thrName + " interrupted.");
			}
			System.out.println(thrName + " terminating.");
	}
	synchronized void startWait(){
		try{
			while(!ready) wait();
		}
		catch(InterruptedException exc){
			System.out.println("wait() interrupted");
		}
	}
	synchronized void notice(){
		ready = true;
		notify();
	}
}
public class Status{
	public static void main(String[] args) throws Exception {
		MyThread thrd = new MyThread();
		thrd.setName("MyThread #1");
		showThreadStatus(thrd);
		thrd.start();
		Thread.sleep(50);
		showThreadStatus(thrd);
		thrd.waiting = false;
		Thread.sleep(50);
		showThreadStatus(thrd);
		thrd.notice();
		Thread.sleep(50);
		showThreadStatus(thrd);
		while(thrd.isAlive())
			System.out.println("alive");
		showThreadStatus(thrd);
	}
	static void showThreadStatus(Thread thrd){
		System.out.println(thrd.getName() + " Alive: = " + thrd.isAlive() + " State: = " + thrd.getState());
	}
}
/* 
MyThread #1 Alive: = false State: = NEW
MyThread #1 starting.
waiting: true
.....
MyThread #1 Alive: = true State: = RUNNABLE
waiting: true
waiting...
MyThread #1 Alive: = true State: = WAITING
MyThread #1 Alive: = true State: = TIMED_WAITING
alive
.....
MyThread #1 terminating.
alive
MyThread #1 Alive: = false State: = TERMINATED
*/