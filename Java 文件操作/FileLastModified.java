/* 
 使用 File 类的 file.lastModified() 方法来获取文件最后的修改时间
 
*/
import java.io.File;
import java.util.Date;

public class FileLastModified{
	public static void main(String[] args){
		File file = new File("D:/java.txt");
		Long lastModified = file.lastModified();
		Date date = new Date(lastModified);
		System.out.println(date);
	}
}
/* 
Mon Sep 26 18:03:38 CST 2016
 */