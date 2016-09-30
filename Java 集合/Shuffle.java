/* 
 使用 Collections 类 Collections.shuffle() 方法来打乱集合元素的顺序
*/
import java.util.*;

public class Shuffle{
	public static void main(String[] args){
		List<Integer> list =  new ArrayList<Integer>();
		for(int i = 0; i < 10; i++)
			list.add(new Integer(i));
		System.out.println("打乱前：");
		System.out.println(list);
		for(int i = 1; i < 6; i++){
			System.out.println("第 " + i + " 次打乱：");
			Collections.shuffle(list);
			System.out.println(list);
		}
	}
}
/* 
打乱前：
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
第 1 次打乱：
[8, 9, 1, 4, 5, 7, 6, 3, 2, 0]
第 2 次打乱：
[2, 9, 5, 8, 1, 6, 0, 7, 3, 4]
第 3 次打乱：
[9, 6, 4, 3, 7, 2, 0, 1, 5, 8]
第 4 次打乱：
[4, 5, 9, 2, 1, 0, 8, 6, 7, 3]
第 5 次打乱：
[9, 4, 8, 1, 2, 5, 3, 7, 0, 6]
 */