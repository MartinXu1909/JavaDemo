/* 
 使用 Java Util 类的 Arrays.asList(name) 方法将数组转换为集合
*/
import java.util.*;
import java.io.*;

public class ArrayToCollection{
	public static void main(String[] args) throws IOException {
		int n = 5; // 5个元素
		String[] name = new String[n];
		for(int i = 0; i < n; i++){
			name[i] = String.valueOf(i);
		}
		List<String> list = Arrays.asList(name);
		System.out.println();
		for(String li :list){
			String str = li;
			System.out.print(str + " ");
		}
	}
}
/* 
0 1 2 3 4
 */