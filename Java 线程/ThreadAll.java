/* 
 ʹ�� getName() ������ȡ�����������е��߳�
 
*/

public class ThreadAll extends Thread{
	public static void main(String[] args){
		ThreadAll t1 = new ThreadAll();
		t1.setName("thread1");
		t1.start();
		ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
		int noThreads = currentGroup.activeCount();
		Thread[] lstThreads = new Thread[noThreads];
		currentGroup.enumerate(lstThreads);
		for(int i = 0; i < noThreads; i++)
			System.out.println("�̺߳ţ�"  + i + "= " + lstThreads[i].getName());
	}
}
/* 
�̺߳ţ�0= main
�̺߳ţ�1= thread1

 */