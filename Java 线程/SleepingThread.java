/* 
 线程挂起
*/

public class SleepingThread extends Thread {
	private int countDown = 5;
	private static int threadCount = 0;
	public SleepingThread(){
		super("" + ++threadCount);
		start();
	}
	public String toString(){
		return "#" + getName() + " : " + countDown;
	}
	public void run(){
		while(true){
			System.out.println(this);
			if(--countDown == 0)
				return;
			try{
				sleep(100);
			}
			catch(InterruptedException e){
				throw new RuntimeException(e);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 5; i++)
			new SleepingThread().join();
		System.out.println("线程已被挂起");
	}
}
/* 
#1 : 5
#1 : 4
#1 : 3
#1 : 2
#1 : 1
#2 : 5
#2 : 4
#2 : 3
#2 : 2
#2 : 1
#3 : 5
#3 : 4
#3 : 3
#3 : 2
#3 : 1
#4 : 5
#4 : 4
#4 : 3
#4 : 2
#4 : 1
#5 : 5
#5 : 4
#5 : 3
#5 : 2
#5 : 1
线程已被挂起
 */