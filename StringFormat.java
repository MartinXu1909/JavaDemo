/* 
 通过 format() 方法来格式化字符串，还可以指定地区来格式化（）
*/
import java.util.*;

public class StringFormat{
	public static void main(String[] args){
		double e = Math.E;
		System.out.format("%f%n", e);
		//指定本地为德国（GERMANY）
		System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);
	}
}
/* 
2.718282
2,7183
 */