/* 
 ʹ�� Collections ��� sort() ������������������
 ��ʹ�� binarySearch() ��������ȡ����Ԫ�ص�����ֵ
*/
import java.util.Collections;
import java.util.Vector;

public class CollectionsSort{
	public static void main(String[] args){
		Vector<String> v = new Vector<String>();
		v.add("X");
		v.add("M");
		v.add("D");
		v.add("A");
		v.add("O");
		Collections.sort(v);
		System.out.println(v);
		int index = Collections.binarySearch(v, "D");
		System.out.println("Ԫ������ֵΪ��" + index);
	}
}
/* 
[A, D, M, O, X]
Ԫ������ֵΪ��1
 */