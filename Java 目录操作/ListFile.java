/* 
使用 File 类的 list 方法来输出指定目录下的所有文件 
*/
import java.io.*;

public class ListFile{
	public static void main(String[] args){
		File dir = new File("D:/work/Java/demoapp");
		String[] children = dir.list();
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
.git
Java 字符串
Java 异常处理
Java 数据结构
Java 数组
Java 文件操作
Java 方法
Java 时间处理
Java 目录操作
Java 线程
Java 网络实例
Java 集合
 */