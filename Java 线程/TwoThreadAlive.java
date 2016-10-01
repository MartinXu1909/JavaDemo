/* 
 通过继承Thread类并使用currentThread()方法来检测一个线程是否存活
*/

public class TwoThreadAlive extends Thread{
	public void run(){
		for(int i = 0; i < 10; i++){
			printMsg();
		}
	}
	public void printMsg(){
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name = " + name);
	}
	public static void main(String[] args){
		TwoThreadAlive tt = new TwoThreadAlive();
		tt.setName("Thread");
		System.out.println("before start(), tt.isAlive() = " + tt.isAlive());
		tt.start();
		System.out.println("just after start(), tt.isAlive() = " + tt.isAlive());
		for(int i = 0; i < 10; i++){
			tt.printMsg();
		}
		System.out.println("The end of main(), tt.isAlive() = " + tt.isAlive());
	}
}
/* 
before start(), tt.isAlive() = false
just after start(), tt.isAlive() = true
name = main
name = Thread
name = main
name = Thread
name = Thread
name = main
name = Thread
name = Thread
name = Thread
name = main
name = Thread
name = main
name = main
name = Thread
name = main
name = Thread
name = main
name = Thread
name = main
name = main
The end of main(), tt.isAlive() = false
 */