/* 
 
 
*/
import java.io.File;

public class Main{
	public static void main(String[] args){
		File file = new File("/data");
		if(file.isDirectory()) {
			String[] files = file.list();
			if(files.length > 0){
				System.out.println("Ŀ¼ " + file.getPath() + " ��Ϊ�գ�");
			}
		}
	}
}
/* 
Ŀ¼ D://Java/file.txt ��Ϊ�գ�
 */