/* 
 使用 linkedlistname.indexof(element) 和 linkedlistname.Lastindexof(elementname) 
 方法在链表中获取元素第一次和最后一次出现的位置
*/
import java.util.LinkedList;

public class LinkedListNameIndex{
	public static void main(String[] args){
		LinkedList<String> lList = new LinkedList<String> ();
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		lList.add("2");
		System.out.println("元素 2 第一次出现的位置：" + lList.indexOf("2"));
		System.out.println("元素 2 最后一次出现的位置：" + lList.lastIndexOf("2"));
	}
}
/* 
元素 2 第一次出现的位置：1
元素 2 最后一次出现的位置：5
 */