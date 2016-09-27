/* 
 使用 File 类的 file.isHidden() 方法来判断文件是否隐藏
*/
import java.io.File;

public class IsHidden{
	public static void main(String[] args){
		File file = new File("D:/Demo.txt");
		System.out.println(file.isHidden());
	}
}
/* 
true
 */