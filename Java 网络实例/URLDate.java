/* 
 ʹ�� HttpURLConnection �� httpCon.getDate() ��������ȡ URL��Ӧͷ��������Ϣ
*/
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class URLDate{
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.zhihu.com");
		HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
		long date = httpCon.getDate();
		if(date == 0)
			System.out.println("�޷���ȡ��Ϣ��");
		else
			System.out.println("Date��" + new Date(date));
	}
}
/* 
Date��Sat Oct 01 18:45:37 CST 2016
 */