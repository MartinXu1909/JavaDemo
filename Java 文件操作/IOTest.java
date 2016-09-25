/* 
 
 
*/
import java.io.*;

public class IOTest{
	public static void main(String[] args){
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));
			out.write("Java文件写入");
			out.close();
			System.out.println("文件创建成功！");
		}
		catch(IOException e){
			
		}
	}
}