/* 
 使用 Java Util 类的 list.add() 和 list.toArray() 方法将集合转为数组
*/
import java.util.*;

public class ListToArray{
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("菜"); 
		list.add("鸟"); 
		list.add("教");
		list.add("程");
		list.add("www.w3cschool.cc");
		String[] s1 = list.toArray(new String[0]); 
		for(int i = 0; i < s1.length; ++i){
			String contents = s1[i];
			System.out.print(contents);
		} 
	}
}
/* 
菜鸟教程www.w3cschool.cc
 */