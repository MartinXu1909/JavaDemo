/* 
 ��λ�ȡԶ���ļ��Ĵ�С
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
			System.out.println("�޷���ȡ�ļ���С��");
		else
			System.out.println("�ļ���СΪ��" + size + " bytes");
		conn.getInputStream().close();
	}
}
/* 
�ļ���СΪ��233954 bytes
 */