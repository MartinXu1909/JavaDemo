/* 
 使用 File 类的 file.exists() 和 file.length() 方法来获取文件大小，
 以字节计算（1KB=1024字节 ）myjavafile.txt文件位于 D 盘
*/
import java.io.File;

public class FileSize{
	public static long getFileSize(String filename){
		File file = new File(filename);
		if(!file.exists() || !file.isFile()){
			System.out.println("文件不存在");
			return -1;
		}
		return file.length();
	}
	public static void main(String[] args){
		long size = getFileSize("D:/myjavafile.txt");
		System.out.println("myjavafile.txt文件大小为：" + size);
	}
}
/* 
myjavafile.txt文件大小为：64
 */