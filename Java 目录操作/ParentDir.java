/* 
 ʹ�� File ��� file.getParent() ��������ȡ�ļ����ϼ�Ŀ¼
*/
import java.io.File;

public class ParentDir{
	public static void main(String[] args){
		//File file = new File("D:/work/Java/demoapp/Java Ŀ¼����/Main.java");
		File file = new File("D:/work/Java/demoapp");
		String strParentDirectory = file.getParent();
		System.out.println("�ļ����ϼ�Ŀ¼Ϊ��"+ strParentDirectory);
	}
}
/* 
�ļ����ϼ�Ŀ¼Ϊ��D:\work\Java
 */