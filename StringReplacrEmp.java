/* 
 ���ʹ��java�滻�ַ����е��ַ��أ�
 ʹ�� java String ��� replace �������滻�ַ����е��ַ�
*/

public class StringReplacrEmp{
	public static void main(String[] args){
		String str = "Hello World";
		System.out.println( str.replace('H', 'W') );
		System.out.println( str.replace("He", "Wa") );
		System.out.println( str.replaceAll("He", "Ha") );
	}
}
/* 
Wello World
Wallo World
Hallo World
 */