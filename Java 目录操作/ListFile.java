/* 
ʹ�� File ��� list ���������ָ��Ŀ¼�µ������ļ� 
*/
import java.io.*;

public class ListFile{
	public static void main(String[] args){
		File dir = new File("D:/work/Java/demoapp");
		String[] children = dir.list();
		if(children == null){
			System.out.println("Ŀ¼�����ڻ�������һ��Ŀ¼");
		}
		else{
			for(int i = 0; i < children.length; i++){
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}
/* 
.git
Java �ַ���
Java �쳣����
Java ���ݽṹ
Java ����
Java �ļ�����
Java ����
Java ʱ�䴦��
Java Ŀ¼����
Java �߳�
Java ����ʵ��
Java ����
 */