/* 
 通过循环输出数组
*/

public class Welcome{
	public static void main(String[] args){
		String[] greeting = new String[3];
		greeting[0] = "This is the greeting ";
		greeting[1] = "for all the readers from ";
		greeting[2] = "Java Source .";
		for( int i = 0; i < greeting.length; i++){
			System.out.println(greeting[i]);
		}
	}
}
/* 
This is the greeting
for all the readers from
Java Source .
 */