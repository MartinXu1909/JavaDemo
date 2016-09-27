/* 
使用 File 类的 dir.list() 方法在指定目录中查找所有文件列表 
*/
import java.io.File;

public class DirList{
	public static void main(String[] args) throws Exception {
		File dir = new File("D:/work/Java/demoapp");
		String[] children = dir.list();
		if(children == null){
			System.out.println("该目录不存在");
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