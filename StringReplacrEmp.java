/* 
 如何使用java替换字符串中的字符呢？
 使用 java String 类的 replace 方法来替换字符串中的字符
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