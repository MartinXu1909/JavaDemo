/* 
 ʹ�� Java �ķ�ת���� reverse() ���ַ�����ת
*/

import java.util.*;

public class StringReverseExample{
	public static void main(String[] args){
		String string = "abcdefg";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse: " + string);
		System.out.println("String after reverse: " + reverse);
	}
}
/* 
String before reverse: abcdefg
String after reverse: gfedcba
 */