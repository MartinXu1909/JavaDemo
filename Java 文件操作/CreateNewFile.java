/* 
使用 File 类的 File() 构造函数和 file.createNewFile() 方法来创建一个新的文件 
*/
import java.io.File;
import java.io.IOException;

public class CreateNewFile{
	public static void main(String[] args){
		try{
			File file = new File("D:/myfile.txt");
			if(file.createNewFile())
				System.out.println("文件创建成功");
			else
				System.out.println("出错了，该文件已经存在。");
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
/* 
文件创建成功
 */