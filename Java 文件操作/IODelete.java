/* 
 ʹ�� delete() �������ļ�ɾ��
 (��Ҫ�� D �����ȴ��� test.txt �ļ�)
*/
import java.io.*;

public class IODelete{
	public static void main(String[] args){
		try{
			File file = new File("D:\\test.txt");
			if(file.delete()){
				System.out.println(file.getName() + " �ļ��ѱ�ɾ����");
			}else{
				System.out.println("�ļ�ɾ��ʧ�ܣ�");
			}
		}catch(Exception e){
			
		}
	}
}
/* 
test.txt �ļ��ѱ�ɾ����
 */