/* 
 使用 Collections 类的 rotate() 来循环移动元素，
 方法第二个参数指定了移动的起始位置
*/
import java.util.*;

public class ListRotate{
	public static void main(String[] args){
		List list = Arrays.asList("one Two three Four five six".split(" "));
		System.out.println("List : " + list);
		Collections.rotate(list, 3);
		System.out.println("rotate: " + list);
	}
}
/* 
List : [one, Two, three, Four, five, six]
rotate: [Four, five, six, one, Two, three]
 */