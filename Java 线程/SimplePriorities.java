/* 
 通过setPriority() 方法来设置线程的优先级
*/

public class SimplePriorities extends Thread {
	private int countDown = 5;
	private volatile double d = 0;
	public SimplePriorities(int priority){
		setPriority(priority);
		start();
	}
	public String toString(){
		return super.toString() + ": " + countDown;
	}
	public void run(){
		while(true){
			for(int i = 1; i < 100000; i++)
				d = d + (Math.PI + Math.E) / (double)i;
			System.out.println(this);
			if(--countDown == 0) return;
 		}
	}
	public static void main(String[] args){
		new SimplePriorities(Thread.MAX_PRIORITY);
		for(int i = 0; i < 5; i++)
		new SimplePriorities(Thread.MIN_PRIORITY);
	}
}
/* 
Thread[Thread-0,10,main]: 5
Thread[Thread-1,1,main]: 5
Thread[Thread-4,1,main]: 5
Thread[Thread-5,1,main]: 5
Thread[Thread-0,10,main]: 4
Thread[Thread-4,1,main]: 4
Thread[Thread-5,1,main]: 4
Thread[Thread-0,10,main]: 3
Thread[Thread-2,1,main]: 5
Thread[Thread-1,1,main]: 4
Thread[Thread-0,10,main]: 2
Thread[Thread-2,1,main]: 4
Thread[Thread-5,1,main]: 3
Thread[Thread-1,1,main]: 3
Thread[Thread-3,1,main]: 5
Thread[Thread-4,1,main]: 3
Thread[Thread-1,1,main]: 2
Thread[Thread-2,1,main]: 3
Thread[Thread-5,1,main]: 2
Thread[Thread-0,10,main]: 1
Thread[Thread-1,1,main]: 1
Thread[Thread-4,1,main]: 2
Thread[Thread-3,1,main]: 4
Thread[Thread-5,1,main]: 1
Thread[Thread-4,1,main]: 1
Thread[Thread-2,1,main]: 2
Thread[Thread-3,1,main]: 3
Thread[Thread-2,1,main]: 1
Thread[Thread-3,1,main]: 2
Thread[Thread-3,1,main]: 1
 */