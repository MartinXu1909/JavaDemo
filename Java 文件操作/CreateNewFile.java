/* 
ʹ�� File ��� File() ���캯���� file.createNewFile() ����������һ���µ��ļ� 
*/
import java.io.File;
import java.io.IOException;

public class CreateNewFile{
	public static void main(String[] args){
		try{
			File file = new File("D:/myfile.txt");
			if(file.createNewFile())
				System.out.println("�ļ������ɹ�");
			else
				System.out.println("�����ˣ����ļ��Ѿ����ڡ�");
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
/* 
�ļ������ɹ�
 */