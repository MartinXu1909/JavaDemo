/* 
 ʹ�� File ��� file.setReadOnly() �� file.canWrite() �����������ļ�ֻ��
 
*/
import java.io.File;

public class ReadOnly{
	public static void main(String[] args){
		File file = new File("D:/work/Java/demoapp/Java �ļ�����/java.txt");
		System.out.println(file.setReadOnly());
		System.out.println(file.canWrite());
	}
}
/* 
true
false
 */