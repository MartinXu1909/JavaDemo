/* 
 ʹ�� Java Util ��� list.add() �� list.toArray() ����������תΪ����
*/
import java.util.*;

public class ListToArray{
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("��"); 
		list.add("��"); 
		list.add("��");
		list.add("��");
		list.add("www.w3cschool.cc");
		String[] s1 = list.toArray(new String[0]); 
		for(int i = 0; i < s1.length; ++i){
			String contents = s1[i];
			System.out.print(contents);
		} 
	}
}
/* 
����̳�www.w3cschool.cc
 */