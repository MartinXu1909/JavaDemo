/* 
 使用 net.URL 类的 url.getProtocol() ,url.getFile() 等方法来解析 URL 地址
*/
import java.net.URL;

public class URLResolve{
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.w3cschool.cc/html/html-tutorial.html");
		System.out.println("URL 是 " + url.toString());
		System.out.println("协议是 " + url.getProtocol());
		System.out.println("文件名是 " + url.getFile());
		System.out.println("主机是 " + url.getHost());
		System.out.println("路径是 " + url.getPath());
		System.out.println("端口号是 " + url.getPort());
		System.out.println("默认端口号是 " + url.getDefaultPort());	
	}
}
/* 
URL 是 http://www.w3cschool.cc/html/html-tutorial.html
协议是 http
文件名是 /html/html-tutorial.html
主机是 www.w3cschool.cc
路径是 /html/html-tutorial.html
端口号是 -1
默认端口号是 80
 */