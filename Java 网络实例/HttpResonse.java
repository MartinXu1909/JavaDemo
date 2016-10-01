/* 
 获取指定 URL 的响应头信息
*/
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

public class HttpResonse{
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.zhihu.com");
        URLConnection conn = url.openConnection();
        
        Map headers = conn.getHeaderFields();
        Set<String> keys = headers.keySet();
        for( String key : keys ){
            String val = conn.getHeaderField(key);
            System.out.println(key+"    "+val);
        }
        System.out.println( conn.getLastModified() );
	}
}
/*
X-Za-Response-Id    000c0f7ae746fec2
null    HTTP/1.1 200 OK
Server    ZWS
Connection    keep-alive
Pragma    no-cache
Date    Sat, 01 Oct 2016 10:51:39 GMT
X-Req-ID    2171FF57EF953A
X-Frame-Options    DENY
Cache-Control    no-store
X-Za-Experiment    default:None
Content-Security-Policy    default-src *; img-src * data:; frame-src 'self' *.zhihu.com getpocket.com note.youdao.com read.amazon.cn; script-src 'self' *.zhihu.com *.google-analytics.com zhstatic.zhihu.com res.wx.qq.com 'unsafe-eval'; style-src 'self' *.zhihu.com 'unsafe-inline'
X-NWS-LOG-UUID    a53b3c59-b2b1-4043-a1a4-fe0828068b46
Vary    Accept-Encoding
Set-Cookie    n_c=1; Domain=zhihu.com; Path=/
Content-Length    8963
Content-Type    text/html; charset=UTF-8
0
 */