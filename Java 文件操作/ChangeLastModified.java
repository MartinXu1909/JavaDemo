/* 
使用 File 类的 fileToChange.lastModified() 和 fileToChange setLastModified() 
方法来修改文件最后的修改日期 
*/
import java.io.File;
import java.util.Date;

public class ChangeLastModified{
	public static void main(String[] args) 
	throws Exception {
		File fileToChange = new File("D:/myjavafile.txt");
		fileToChange.createNewFile();
		Date filetime = new Date(fileToChange.lastModified());
		System.out.println(filetime.toString());
		System.out.println(fileToChange.setLastModified
		(System.currentTimeMillis()));
		filetime = new Date(fileToChange.lastModified());
		System.out.println(filetime.toString());
	}
}
/* 
Mon Sep 26 17:45:12 CST 2016
true
Mon Sep 26 18:00:35 CST 2016
 */