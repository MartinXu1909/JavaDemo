/* 
 ʹ�� Collections ��� replaceAll() ���滻List�����е�ָ��Ԫ��
*/
import java.util.*;

public class ReplaceList{
	public static void main(String[] args){
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println("List : " + list);
		Collections.replaceAll(list, "one", "hundread");
		System.out.println("replaceAll: " + list);
	}
}
/* 
List : [one, Two, three, Four, five, six, one, three, Four]
replaceAll: [hundread, Two, three, Four, five, six, hundread, three, Four]
 */