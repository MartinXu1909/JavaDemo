/* 
 ʹ�� File ��� dir.isDirectory() �� dir.list() ����������Ŀ¼
*/
import java.io.File;

public class DirectoryList{
	public static void main(String[] args) throws Exception {
		System.out.println("����Ŀ¼");
		File dir = new File("D:/work/Java/demoapp/Java Ŀ¼����");// Ҫ������Ŀ¼
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
����Ŀ¼
D:\work\Java\demoapp\Java Ŀ¼����
D:\work\Java\demoapp\Java Ŀ¼����\DeleteDirDemo.class
D:\work\Java\demoapp\Java Ŀ¼����\DeleteDirDemo.java
D:\work\Java\demoapp\Java Ŀ¼����\DirectoryList.class
D:\work\Java\demoapp\Java Ŀ¼����\DirectoryList.java
D:\work\Java\demoapp\Java Ŀ¼����\DirLastModified.class
D:\work\Java\demoapp\Java Ŀ¼����\DirLastModified.java
D:\work\Java\demoapp\Java Ŀ¼����\DirList.class
D:\work\Java\demoapp\Java Ŀ¼����\DirList.java
D:\work\Java\demoapp\Java Ŀ¼����\DirSize.class
D:\work\Java\demoapp\Java Ŀ¼����\DirSize.java
D:\work\Java\demoapp\Java Ŀ¼����\FileUtil$1.class
D:\work\Java\demoapp\Java Ŀ¼����\FileUtil.class
D:\work\Java\demoapp\Java Ŀ¼����\FileUtil.java
D:\work\Java\demoapp\Java Ŀ¼����\IsHidden.java
D:\work\Java\demoapp\Java Ŀ¼����\IsHiden.class
D:\work\Java\demoapp\Java Ŀ¼����\ListDir$1.class
D:\work\Java\demoapp\Java Ŀ¼����\ListDir.class
D:\work\Java\demoapp\Java Ŀ¼����\ListDir.java
D:\work\Java\demoapp\Java Ŀ¼����\ListFile.class
D:\work\Java\demoapp\Java Ŀ¼����\ListFile.java
D:\work\Java\demoapp\Java Ŀ¼����\ListName.class
D:\work\Java\demoapp\Java Ŀ¼����\ListName.java
D:\work\Java\demoapp\Java Ŀ¼����\ListRoots.class
D:\work\Java\demoapp\Java Ŀ¼����\ListRoots.java
D:\work\Java\demoapp\Java Ŀ¼����\Main.class
D:\work\Java\demoapp\Java Ŀ¼����\Main.java
D:\work\Java\demoapp\Java Ŀ¼����\Mkdirs.class
D:\work\Java\demoapp\Java Ŀ¼����\Mkdirs.java
D:\work\Java\demoapp\Java Ŀ¼����\ParentDir.class
D:\work\Java\demoapp\Java Ŀ¼����\ParentDir.java
D:\work\Java\demoapp\Java Ŀ¼����\Property.class
D:\work\Java\demoapp\Java Ŀ¼����\Property.java
 */