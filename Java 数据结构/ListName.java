/* 
 ʹ�� listname.add() �� listname.set() �������޸������е�Ԫ��
*/
import java.util.LinkedList;

public class ListName{
	public static void main(String[] args){
		LinkedList<String> officers = new LinkedList<String> ();
		officers.add("B");
		officers.add("B");
		officers.add("T");
		officers.add("H");
		officers.add("P");
		System.out.println(officers);
		officers.set(2, "M");
		System.out.println(officers);
	}
}
/* 
[B, B, T, H, P]
[B, B, M, H, P]
 */