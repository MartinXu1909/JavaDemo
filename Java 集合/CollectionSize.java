/* 
 ʹ�� Collections �� ��collection.add() ���������
 ��ʹ�� collection.size()�����㼯�ϵĳ���
*/
import java.util.*;

public class CollectionSize{
	public static void main(String[] args){
		System.out.println("����ʵ����\n");
		int size;
		HashSet collection = new HashSet();
		String str1 = "yellow", str2 = "White", str3 = "Green", str4 = "Blue";
		Iterator iterator;
		collection.add(str1);
		collection.add(str2);
		collection.add(str3);
		collection.add(str4);
		System.out.print("�������ݣ�");
		iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		size = collection.size();
		if(collection.isEmpty()){
			System.out.println("�����ǿյģ�");
		}
		else{
			System.out.println("���ϳ��ȣ�" + size);
		}
		System.out.println();
	}
}
/* 
����ʵ����

�������ݣ�White Blue yellow Green
���ϳ��ȣ�4
 */