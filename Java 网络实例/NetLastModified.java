/* 
 ��β鿴����ָ���ļ�������޸�ʱ��
*/
import java.text.SimpleDateFormat;
import java.net.URL;
import java.net.URLConnection;

public class NetLastModified{
	public static void main(String[] args) throws Exception {
		URL u = new URL("http://127.0.0.1:8000/Desktop/java.bmp");
		URLConnection uc = u.openConnection();
		uc.setUseCaches(false);
		long timestemp = uc.getLastModified();
		String strDateFormat = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("java.bmp �ļ�����޸�ʱ�䣺" + sdf.format(timestemp));
	}
}
/* 
java.bmp �ļ�����޸�ʱ�䣺2016-10-01 17:57:59
 */