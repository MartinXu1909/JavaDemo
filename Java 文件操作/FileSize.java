/* 
 ʹ�� File ��� file.exists() �� file.length() ��������ȡ�ļ���С��
 ���ֽڼ��㣨1KB=1024�ֽ� ��myjavafile.txt�ļ�λ�� D ��
*/
import java.io.File;

public class FileSize{
	public static long getFileSize(String filename){
		File file = new File(filename);
		if(!file.exists() || !file.isFile()){
			System.out.println("�ļ�������");
			return -1;
		}
		return file.length();
	}
	public static void main(String[] args){
		long size = getFileSize("D:/myjavafile.txt");
		System.out.println("myjavafile.txt�ļ���СΪ��" + size);
	}
}
/* 
myjavafile.txt�ļ���СΪ��64
 */