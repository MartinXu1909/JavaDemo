/* 
 使用 readLine() 方法来读取文件 test.log 内容，其中 test.log 文件内容为
*/
import java.io.*;

public class IORead{
	public static void main(String[] args){
		try{
			BufferedReader in = new BufferedReader(new FileReader("test.log"));
			String str;
			while((str = in.readLine()) != null){
				System.out.println(str);
			}
			System.out.println(str);
		} catch(IOException e){
			
		}
	}
}
/* 
文件读取
www.google.com
null
 */