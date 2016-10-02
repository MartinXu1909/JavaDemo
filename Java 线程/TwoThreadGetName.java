/* 
 通过继承 Thread 类并使用 getName() 方法来获取当前线程名称
*/

public class TwoThreadGetName extends Thread {
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
		TwoThreadGetName tt = new TwoThreadGetName();
		tt.start();
		for(int i = 0; i < 10; i++){
			tt.printMsg();
		}
	}
}
/* 
name = main
name = main
name = main
name = main
name = main
name = main
name = main
name = Thread-0
name = main
name = main
name = main
name = Thread-0
name = Thread-0
name = Thread-0
name = Thread-0
name = Thread-0
name = Thread-0
name = Thread-0
name = Thread-0
name = Thread-0
 */