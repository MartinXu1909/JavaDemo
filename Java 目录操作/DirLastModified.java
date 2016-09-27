/* 
使用 File 类的 file.lastModified() 方法来获取目录的最后修改时间 
*/
import java.io.File;
import java.util.Date;

public class DirLastModified{
	public static void main(String[] args){
		File file = new File("D:/work/Java/demoapp");
		System.out.println("最后修改时间：" + new Date(file.lastModified()));;
	}
}
/* 
最后修改时间：Sat Sep 24 15:45:25 CST 2016
 */