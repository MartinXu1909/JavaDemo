/* 
 使用 delete() 方法将文件删除
 (需要在 D 盘上先创建 test.txt 文件)
*/
import java.io.*;

public class IODelete{
	public static void main(String[] args){
		try{
			File file = new File("D:\\test.txt");
			if(file.delete()){
				System.out.println(file.getName() + " 文件已被删除！");
			}else{
				System.out.println("文件删除失败！");
			}
		}catch(Exception e){
			
		}
	}
}
/* 
test.txt 文件已被删除！
 */