/* 
 ʹ�� Collections ��� max() �� min() ��������ȡList�������Сֵ
*/
import java.util.*;

public class ListMax{
	public static void main(String[] args){
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println(list);
		System.out.println("���ֵ��" + Collections.max(list));
		System.out.println("��Сֵ��" + Collections.min(list));
	}
}
/* 
[one, Two, three, Four, five, six]
���ֵ��three
��Сֵ��Four
 */