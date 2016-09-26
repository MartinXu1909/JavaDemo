/* 
 使用 File 类的 oldName.renameTo(newName) 方法来重命名文件
 执行该程序前你可以先创建 myjavafile.txt 文件
*/
import java.io.File;

public class Rename{
	public static void main(String[] args){
		File oldName = new File("D:/myjavafile.txt");
		File newName = new File("D:/java.txt");
		if(oldName.renameTo(newName)){
			System.out.println("已重命名");
		}else{
			System.out.println("error");
		}
	}
}
/* 
已重命名
 */