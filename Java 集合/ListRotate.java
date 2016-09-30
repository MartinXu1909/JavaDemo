/* 
 ʹ�� Collections ��� rotate() ��ѭ���ƶ�Ԫ�أ�
 �����ڶ�������ָ�����ƶ�����ʼλ��
*/
import java.util.*;

public class ListRotate{
	public static void main(String[] args){
		List list = Arrays.asList("one Two three Four five six".split(" "));
		System.out.println("List : " + list);
		Collections.rotate(list, 3);
		System.out.println("rotate: " + list);
	}
}
/* 
List : [one, Two, three, Four, five, six]
rotate: [Four, five, six, one, Two, three]
 */