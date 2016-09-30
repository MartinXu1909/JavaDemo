/* 
 ʹ�� Collections ��� indexOfSubList() �� lastIndexOfSubList() �������鿴���б��Ƿ����б��У�
 ���鿴���б����б������ڵ�λ��
*/
import java.util.*;

public class IndexSubList{
	public static void main(String[] args){
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println("List : " + list);
		List sublist  = Arrays.asList("three Four".split(" "));
		System.out.println("���б�" + sublist);
		System.out.println("indexOfSubList: " + Collections.indexOfSubList(list, sublist));
		System.out.println("lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
	}
}
/* 
List : [one, Two, three, Four, five, six, one, three, Four]
���б�[three, Four]
indexOfSubList: 2
lastIndexOfSubList: 7
 */