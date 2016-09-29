/* 
使用 LinkedList 类的 linkedlistname.getFirst() 和 linkedlistname.getLast() 
来获取链表的第一个和最后一个元素 
*/
import java.util.LinkedList;

public class LinkedListDemo1{
	public static void main(String[] args){
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("100");
		lList.add("200");
		lList.add("300");
		lList.add("400");
		lList.add("500");
		System.out.println("链表的第一个元素是：" + lList.getFirst());
		System.out.println("链表的最后一个元素是：" + lList.getLast());
	}
}
/* 
链表的第一个元素是：100
链表的最后一个元素是：500
 */