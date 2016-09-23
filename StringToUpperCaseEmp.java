/* 
 使用了 String toUpperCase() 方法将字符串从小写转为大写
*/

public class StringToUpperCaseEmp{
	public static void main(String[] args){
		String str = "string abc touppercase ";
		String strUpper = str.toUpperCase();
		System.out.println("Original String: " + str);
		System.out.println("String changed to upper case: " + strUpper);
	}
}
/* 
Original String: string abc touppercase
String changed to upper case: STRING ABC TOUPPERCASE
 */