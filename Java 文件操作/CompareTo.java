/* 
ʹ�� File ��� filename.compareTo (another filename) 
�������Ƚ������ļ�·���Ƿ���ͬһ��Ŀ¼�� 
*/
import java.io.File;

public class CompareTo{
	public static void main(String[] args){
		File file1 = new File("C:/java.txt");
		File file2 = new File("D:/java.txt");
		if(file1.compareTo(file2) == 0){
			System.out.println("�ļ�·��һ�£�");
		}else{
			System.out.println("�ļ�·����һ�£�");
		}
	}
}
/* 
�ļ�·����һ�£�
 */