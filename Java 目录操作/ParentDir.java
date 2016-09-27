/* 
 使用 File 类的 file.getParent() 方法来获取文件的上级目录
*/
import java.io.File;

public class ParentDir{
	public static void main(String[] args){
		//File file = new File("D:/work/Java/demoapp/Java 目录操作/Main.java");
		File file = new File("D:/work/Java/demoapp");
		String strParentDirectory = file.getParent();
		System.out.println("文件的上级目录为："+ strParentDirectory);
	}
}
/* 
文件的上级目录为：D:\work\Java
 */