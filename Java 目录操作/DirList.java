/* 
ʹ�� File ��� dir.list() ������ָ��Ŀ¼�в��������ļ��б� 
*/
import java.io.File;

public class DirList{
	public static void main(String[] args) throws Exception {
		File dir = new File("D:/work/Java/demoapp");
		String[] children = dir.list();
		if(children == null){
			System.out.println("��Ŀ¼������");
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