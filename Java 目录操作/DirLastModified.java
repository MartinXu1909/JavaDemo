/* 
ʹ�� File ��� file.lastModified() ��������ȡĿ¼������޸�ʱ�� 
*/
import java.io.File;
import java.util.Date;

public class DirLastModified{
	public static void main(String[] args){
		File file = new File("D:/work/Java/demoapp");
		System.out.println("����޸�ʱ�䣺" + new Date(file.lastModified()));;
	}
}
/* 
����޸�ʱ�䣺Sat Sep 24 15:45:25 CST 2016
 */