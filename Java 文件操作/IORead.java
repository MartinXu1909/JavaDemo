/* 
 ʹ�� readLine() ��������ȡ�ļ� test.log ���ݣ����� test.log �ļ�����Ϊ
*/
import java.io.*;

public class IORead{
	public static void main(String[] args){
		try{
			BufferedReader in = new BufferedReader(new FileReader("test.log"));
			String str;
			while((str = in.readLine()) != null){
				System.out.println(str);
			}
			System.out.println(str);
		} catch(IOException e){
			
		}
	}
}
/* 
�ļ���ȡ
www.google.com
null
 */