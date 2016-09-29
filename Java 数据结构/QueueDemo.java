/* 
 ������һ����������Ա���ֻ�����ڱ��ǰ�˽���ɾ�����������ڱ�ĺ�˽��в��������
LinkedList��ʵ����Queue�ӿڣ�������ǿ��԰�LinkedList����Queue���á�

����ʵ����ʾ�˶��У�Queue�����÷� 
*/
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo{
	public static void main(String[] args){
		//add()��remove()������ʧ�ܵ�ʱ����׳��쳣(���Ƽ�)
		Queue<String> queue = new LinkedList<String>();
		//���Ԫ��
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		for(String q : queue){
			System.out.println(q);
		}
		System.out.println("===");
		//���ص�һ��Ԫ�أ����ڶ�����ɾ��
		System.out.println("poll = " + queue.poll());
		for(String q : queue){
			System.out.println(q);
		}
		System.out.println("===");
		//���ص�һ��Ԫ��
		System.out.println("element = " + queue.element());
		for(String q : queue){
			System.out.println(q);
		}
		System.out.println("===");
		//���ص�һ��Ԫ��
		System.out.println("peek = " + queue.peek());
		for(String q : queue){
			System.out.println(q);
		}
	}
}
/* 
a
b
c
d
e
===
poll = a
b
c
d
e
===
element = b
b
c
d
e
===
peek = b
b
c
d
e
 */