/* 
在 E 盘中查找以字母 'p' 开头的所有文件 
*/
import java.io.*;

public class FileUtil{
	public static void main(String[] args){
		File dir = new File("E:");
		FilenameFilter filter = new FilenameFilter(){
			public boolean accept(File dir, String name){
				return name.startsWith("p");
			}
		};
		String[] children = dir.list(filter);
		if(children == null){
			System.out.println("目录不存在或它不是一个目录");
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
python
 */