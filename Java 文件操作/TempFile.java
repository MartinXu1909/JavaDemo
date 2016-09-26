/* 
 使用 File 类的 createTempFile() 方法来创建临时文件
*/
import java.io.*;

public class TempFile{
	public static void main(String[] args) throws Exception {
		File temp = File.createTempFile("pattern", ".suffux");
		temp.deleteOnExit();
		BufferedWriter out = new BufferedWriter(new FileWriter(temp));
		out.write("aString");
		System.out.println("临时文件已创建");
		out.close();
	}
}
/* 
临时文件已创建
 */