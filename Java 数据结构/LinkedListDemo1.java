/* 
ʹ�� LinkedList ��� linkedlistname.getFirst() �� linkedlistname.getLast() 
����ȡ����ĵ�һ�������һ��Ԫ�� 
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
		System.out.println("����ĵ�һ��Ԫ���ǣ�" + lList.getFirst());
		System.out.println("��������һ��Ԫ���ǣ�" + lList.getLast());
	}
}
/* 
����ĵ�һ��Ԫ���ǣ�100
��������һ��Ԫ���ǣ�500
 */