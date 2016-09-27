/* 
 使用 File 类的 dir.isDirectory() 和 dir.list() 方法来遍历目录
*/
import java.io.File;

public class DirectoryList{
	public static void main(String[] args) throws Exception {
		System.out.println("遍历目录");
		File dir = new File("D:/work/Java/demoapp/Java 目录操作");// 要遍历的目录
		visitAllDirsAndFiles(dir);
	}
	public static void visitAllDirsAndFiles(File dir){
		System.out.println(dir);
		if(dir.isDirectory()) {
			String[] children = dir.list();
			for(int i = 0; i < children.length; i++){
				visitAllDirsAndFiles(new File(dir, children[i]));
			}
		}
	}
}
/* 
遍历目录
D:\work\Java\demoapp\Java 目录操作
D:\work\Java\demoapp\Java 目录操作\DeleteDirDemo.class
D:\work\Java\demoapp\Java 目录操作\DeleteDirDemo.java
D:\work\Java\demoapp\Java 目录操作\DirectoryList.class
D:\work\Java\demoapp\Java 目录操作\DirectoryList.java
D:\work\Java\demoapp\Java 目录操作\DirLastModified.class
D:\work\Java\demoapp\Java 目录操作\DirLastModified.java
D:\work\Java\demoapp\Java 目录操作\DirList.class
D:\work\Java\demoapp\Java 目录操作\DirList.java
D:\work\Java\demoapp\Java 目录操作\DirSize.class
D:\work\Java\demoapp\Java 目录操作\DirSize.java
D:\work\Java\demoapp\Java 目录操作\FileUtil$1.class
D:\work\Java\demoapp\Java 目录操作\FileUtil.class
D:\work\Java\demoapp\Java 目录操作\FileUtil.java
D:\work\Java\demoapp\Java 目录操作\IsHidden.java
D:\work\Java\demoapp\Java 目录操作\IsHiden.class
D:\work\Java\demoapp\Java 目录操作\ListDir$1.class
D:\work\Java\demoapp\Java 目录操作\ListDir.class
D:\work\Java\demoapp\Java 目录操作\ListDir.java
D:\work\Java\demoapp\Java 目录操作\ListFile.class
D:\work\Java\demoapp\Java 目录操作\ListFile.java
D:\work\Java\demoapp\Java 目录操作\ListName.class
D:\work\Java\demoapp\Java 目录操作\ListName.java
D:\work\Java\demoapp\Java 目录操作\ListRoots.class
D:\work\Java\demoapp\Java 目录操作\ListRoots.java
D:\work\Java\demoapp\Java 目录操作\Main.class
D:\work\Java\demoapp\Java 目录操作\Main.java
D:\work\Java\demoapp\Java 目录操作\Mkdirs.class
D:\work\Java\demoapp\Java 目录操作\Mkdirs.java
D:\work\Java\demoapp\Java 目录操作\ParentDir.class
D:\work\Java\demoapp\Java 目录操作\ParentDir.java
D:\work\Java\demoapp\Java 目录操作\Property.class
D:\work\Java\demoapp\Java 目录操作\Property.java
 */