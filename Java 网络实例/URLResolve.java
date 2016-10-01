/* 
 ʹ�� net.URL ��� url.getProtocol() ,url.getFile() �ȷ��������� URL ��ַ
*/
import java.net.URL;

public class URLResolve{
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.w3cschool.cc/html/html-tutorial.html");
		System.out.println("URL �� " + url.toString());
		System.out.println("Э���� " + url.getProtocol());
		System.out.println("�ļ����� " + url.getFile());
		System.out.println("������ " + url.getHost());
		System.out.println("·���� " + url.getPath());
		System.out.println("�˿ں��� " + url.getPort());
		System.out.println("Ĭ�϶˿ں��� " + url.getDefaultPort());	
	}
}
/* 
URL �� http://www.w3cschool.cc/html/html-tutorial.html
Э���� http
�ļ����� /html/html-tutorial.html
������ www.w3cschool.cc
·���� /html/html-tutorial.html
�˿ں��� -1
Ĭ�϶˿ں��� 80
 */