/* 
 使用 InetAddress 类的 getLocalAddress() 方法获取本机ip地址及主机名
*/
import java.net.InetAddress;

public class LocalAddress{
	public static void main(String[] args) throws Exception {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("Local HostAddress: " + addr.getHostAddress());
		String hostname = addr.getHostName();
		System.out.println("Local host name: " + hostname);
	}
}
/* 
Local HostAddress: 169.254.81.176
Local host name: DESKTOP-EKFFBJM
 */