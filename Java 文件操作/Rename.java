/* 
 ʹ�� File ��� oldName.renameTo(newName) �������������ļ�
 ִ�иó���ǰ������ȴ��� myjavafile.txt �ļ�
*/
import java.io.File;

public class Rename{
	public static void main(String[] args){
		File oldName = new File("D:/myjavafile.txt");
		File newName = new File("D:/java.txt");
		if(oldName.renameTo(newName)){
			System.out.println("��������");
		}else{
			System.out.println("error");
		}
	}
}
/* 
��������
 */