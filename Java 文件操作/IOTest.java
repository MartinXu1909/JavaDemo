/* 
 ����ʵ����ʾ��ʹ�� write() �������ļ�д������
*/
import java.io.*;

public class IOTest{
	public static void main(String[] args){
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));
			out.write("Java�ļ�д��");
			out.close();
			System.out.println("�ļ������ɹ���");
		}
		catch(IOException e){
			
		}
	}
}
/* 
����ʵ����ʾ��ʹ�� write() �������ļ�д������
 */