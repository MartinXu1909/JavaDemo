/* 
 多线程异常处理方法
*/
class MyThread extends Thread{
	public void run(){
		System.out.println("Throwing in " + "MyThread");
		throw new RuntimeException();
	}
}
public class ThreadException{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start();
		try{
			Thread.sleep(1000);
		}
		catch (Exception e){
			System.out.println("Caught it" + e);			
		}
		System.out.println("Exiting main");
	}
}
/* 
Throwing in MyThread
Exception in thread "Thread-0" java.lang.RuntimeException
        at MyThread.run(ThreadException.java:8)
Exiting main
 */