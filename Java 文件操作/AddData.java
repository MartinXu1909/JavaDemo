/* 
 使用 filewriter 方法向文件中追加数据
*/
import java.io.*;

public class AddData{
	public static void main(String[] args) throws Exception {
		try{
			BufferedWriter out = new BufferedWriter 
			(new FileWriter("filename"));
			out.write("aString1\n");
			out.close();
			out = new BufferedWriter(new FileWriter
			("filename", true));
			out.write("aString2");
			out.close();
			BufferedReader in = new BufferedReader 
			(new FileReader("filename"));
			String str;
			while((str = in.readLine()) != null){
				System.out.println(str);
			}
			in.close();
		}
		catch(IOException e){
			System.out.println("exception occoured" + e);
		}
	}
}
/* 
aString1
aString2
 */