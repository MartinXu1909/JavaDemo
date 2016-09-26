/* 
 使用 File 类的 file.setReadOnly() 和 file.canWrite() 方法来设置文件只读
 
*/
import java.io.File;

public class ReadOnly{
	public static void main(String[] args){
		File file = new File("D:/work/Java/demoapp/Java 文件操作/java.txt");
		System.out.println(file.setReadOnly());
		System.out.println(file.canWrite());
	}
}
/* 
true
false
 */