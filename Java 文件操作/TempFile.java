/* 
 ʹ�� File ��� createTempFile() ������������ʱ�ļ�
*/
import java.io.*;

public class TempFile{
	public static void main(String[] args) throws Exception {
		File temp = File.createTempFile("pattern", ".suffux");
		temp.deleteOnExit();
		BufferedWriter out = new BufferedWriter(new FileWriter(temp));
		out.write("aString");
		System.out.println("��ʱ�ļ��Ѵ���");
		out.close();
	}
}
/* 
��ʱ�ļ��Ѵ���
 */