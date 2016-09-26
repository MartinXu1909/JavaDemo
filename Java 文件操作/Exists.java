/* 
 使用 File 类的 file.exists() 方法来检测文件是否存在
 如果你的 D 盘中存在文件 java.txt
*/
import java.io.File;

public class Exists{
	public static void main(String[] args){
		File file = new File("D:/java.txt");
		System.out.println(file.exists());
	}
}
/* 
true
 */