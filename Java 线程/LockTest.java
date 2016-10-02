/* 
 ����������һ�����Σ�����߳�ͬʱ�������������е�һ������ȫ�����ڵȴ�ĳ����Դ���ͷš������̱߳������ڵ���������˳��򲻿���������ֹ��

 java �����������ĸ���Ҫ������
	1������ʹ�ã�������Դ��һ���߳�ʹ��(ռ��)ʱ������̲߳���ʹ��
	2��������ռ����Դ�����߲���ǿ�ƴ���Դռ�������ж�ȡ��Դ����Դֻ������Դռ���������ͷš�
	3������ͱ��֣�������Դ��������������������Դ��ͬʱ���ֶ�ԭ����Դ��ռ�С�
	4��ѭ���ȴ���������һ���ȴ����У�P1ռ��P2����Դ��P2ռ��P3����Դ��P3ռ��P1����Դ���������γ���һ���ȴ���·��
�������ĸ�������������ʱ�򣬱��γ���������Ȼ�������������������������κ�һ�������������������ʧ��������java������ģ��һ�������Ĳ�����

�����������ķ����ǣ�һ������synchronized��һ������Lock��ʽ��ʵ�֡�

�������ǡ����ʹ���������ҳ���ͬʱҪ���������ʱ�������������������� 
*/
import java.util.Date;

public class LockTest{
	public static String obj1 = "obj1";
	public static String obj2 = "obj2";
	public static void main(String[] args){
		LockA la = new LockA();
		new Thread(la).start();
		LockB lb = new LockB();
		new Thread(lb).start();
	}
}
class LockA implements Runnable{
	public void run(){
		try{
			System.out.println(new Date().toString() + " LockA ��ʼִ��");
			while(true){
				synchronized (LockTest.obj1){
					System.out.println(new Date().toString() + " LockA ��ס obj1");
					Thread.sleep(3000); // �˴��ȴ��Ǹ�B����ס����
					synchronized (LockTest.obj2){
						System.out.println(new Date().toString() + " LockA ��ס obj2");
						Thread.sleep(60 * 1000);// Ϊ���ԣ�ռ���˾Ͳ���
					}
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
class LockB implements Runnable{
	public void run(){
		try{
			System.out.println(new Date().toString() + " LockB ��ʼִ��");
			while(true){
				synchronized (LockTest.obj2){
					System.out.println(new Date().toString() + " LockB ��ס obj2");
					Thread.sleep(3000); // �˴��ȴ��Ǹ�A����ס����
					synchronized (LockTest.obj1){
						System.out.println(new Date().toString() + " LockB ��ס obj1");
						Thread.sleep(60 * 1000);// Ϊ���ԣ�ռ���˾Ͳ���
					}
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
/* 
Sun Oct 02 16:52:40 CST 2016 LockB ��ʼִ��
Sun Oct 02 16:52:40 CST 2016 LockA ��ʼִ��
Sun Oct 02 16:52:40 CST 2016 LockB ��ס obj2
Sun Oct 02 16:52:40 CST 2016 LockA ��ס obj1
 */