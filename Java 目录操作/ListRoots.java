/* 
使用 File 类的 listRoots() 方法来输出系统所有根目录
*/
import java.io.*;

public class ListRoots{
	public static void main(String[] args){
		File[] roots = File.listRoots();
		System.out.println("系统所有根目录：");
		for(int i = 0; i < roots.length; i++){
			System.out.println(roots[i].toString());
		}
	}
}
/* 
系统所有根目录：
C:\
D:\
E:\
F:\
 */