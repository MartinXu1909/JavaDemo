/* 
通过字符串函数 strOrig.lastIndexOf(Stringname) 来查找
子字符串 Stringname 在 strOrig 出现的位置：
 */
public class SearchLastString{
	public static void main(String[] args){
		String strOrig = "Hello world ,Hello Reader";
		int lastIndex = strOrig.lastIndexOf("Hello");
		if(lastIndex == -1){
			System.out.println("Hello not found");
		} else{
			System.out.println("Last occurrence of Hello is at index " + lastIndex );
		}
	}
}
/* 
Last occurrence of Hello is at index 13
 */