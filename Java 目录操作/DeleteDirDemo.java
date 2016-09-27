/* 
 使用 File 类的 ofdir.isDirectory(), dir.list() 和 deleteDir() 方法在一个个删除文件后删除目录
*/
import java.io.File;

public class DeleteDirDemo{
	public static void main(String[] args) throws Exception{
		// 删除当前目录下的test 目录
		deleteDir(new File("./test"));
	}
	public static boolean deleteDir(File dir){
		if(dir.isDirectory()) {
			String[] children = dir.list();
			for(int i = 0; i < children.length; i++){
				boolean success = deleteDir(new File(dir, children[i]));
				if(!success){
					return false;
				}
			}
		}
		if(dir.delete()) {
			System.out.println("目录已被删除");
			return true;
		} else {
			System.out.println("目录删除失败！");
			return false;
		}
	}
}
/* 
目录已被删除
 */