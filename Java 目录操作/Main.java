/* 
 使用 File 类的 file.isDirectory(),file.list() 和 file.getPath() 方法来判断目录是否为空
*/
import java.io.File;

public class Main{
	public static void main(String[] args){
		File file = new File("/data");
		if(file.isDirectory()) {
			String[] files = file.list();
			if(files.length > 0){
				System.out.println("目录 " + file.getPath() + " 不为空！");
			}
		}
	}
}
/* 
目录 D://Java/file.txt 不为空！
 */