/* 
 ʹ�� Collections.reverse(ArrayList) ��������з�ת
*/
import java.util.ArrayList;
import java.util.Collections;

public class MainReverse{
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		ArrayList arrayList = new ArrayList();
		//ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println("��תǰ����" + arrayList);
		Collections.reverse(arrayList);
		System.out.println("��ת������" + arrayList);
	}
}
/* 
��תǰ����[A, B, C, D, E]
��ת������[E, D, C, B, A]
 */