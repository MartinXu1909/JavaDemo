/* 
使用 System 的 getProperty() 方法来获取当前的工作目录 
*/

public class Property{
	public static void main(String[] args){
		String curDir = System.getProperty("user.dir");
		System.out.println("你当前的工作目录为：" + curDir);
	}
}
/* 
你当前的工作目录为：D:\work\Java\demoapp\Java 目录操作
 */