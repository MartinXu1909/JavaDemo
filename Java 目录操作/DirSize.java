/* 
使用 File 类的 FileUtils.sizeofDirectory(File Name) 来获取目录的大小 
*/
import java.io.File;
import org.apache.commons.io.FileUtils;

public class DirSize{
	public static void main(String[] args){
		long size = FileUtils.sizeOfDirectory(new File("D:/java"));
		System.out.println("Size: " + size + " bytes");
	}
}
/* 
Size: 2048 bytes
 */