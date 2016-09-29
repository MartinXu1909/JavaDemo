/* 
 使用 Clear() 方法来删除链表中的元素
*/
import java.util.*;

public class LinkedListDemo2{
	public static void main(String[] args){
		LinkedList<String> lList = new LinkedList<String> ();
		lList.add("1");
		lList.add("8");
		lList.add("6");
		lList.add("4");
		lList.add("5");
		System.out.println(lList);
		lList.subList(2, 4).clear();
		System.out.println(lList);
	}
}
/* 
[1, 8, 6, 4, 5]
[1, 8, 5]
 */