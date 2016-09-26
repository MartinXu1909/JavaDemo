/* 
使用 File 类的 file.createTempFile() 方法在指定目录中创建文件 
*/
import java.io.File;

public class CreateTempFile{
	public static void main(String[] args) throws Exception {
		File file = null;
		File dir = new File("D:/");
		file = File.createTempFile("JavaTemp", ".javatemp", dir);
		System.out.println(file.getPath());
	}
}
/* 
D:\JavaTemp7102034225845335139.javatemp
 */