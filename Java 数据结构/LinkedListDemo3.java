/* 
 使用 top() 和 pop() 方法来获取链表的元素
*/
import java.util.*;

public class LinkedListDemo3{
	private LinkedList<Object> list = new LinkedList<Object>();
	public void push(Object v){
		list.addFirst(v);
	}
	public Object top(){
		return list.getFirst();
	}
	public Object pop(){
		return list.removeFirst();
	}
	public static void main(String[] args){
		LinkedListDemo3 stack = new LinkedListDemo3();
		for(int i = 30; i < 40; i++)
			stack.push(new Integer(i));
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
/* 
39
39
38
37

 */