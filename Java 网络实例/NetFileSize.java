/* 
 如何获取远程文件的大小
*/
import java.net.URL;
import java.net.URLConnection;

public class NetFileSize{
	public static void main(String[] args) throws Exception {
		int size;
		URL url = new URL("https://pic4.zhimg.com/3183ae28a7f7ff2d93ca3ad27ca07b9b_b.jpg");
		URLConnection conn = url.openConnection();
		size = conn.getContentLength();
		if(size < 0)
			System.out.println("无法获取文件大小。");
		else
			System.out.println("文件大小为：" + size + " bytes");
		conn.getInputStream().close();
	}
}
/* 
文件大小为：233954 bytes
 */