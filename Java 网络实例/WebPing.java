/* 
 使用 net.Socket 类的 getInetAddress() 方法来连接到指定主机
*/
import java.net.InetAddress;
import java.net.Socket;

public class WebPing{
	public static void main(String[] args){
		try{
			InetAddress addr;
			Socket sock = new Socket("www.baidu.com", 80);
			addr = sock.getInetAddress();
			System.out.println("连接到 " + addr);
			sock.close();
		} catch(java.io.IOException e){
			System.out.println("无法连接到 " + args[0]);
			System.out.println(e);
		}
	}
}
/* 
连接到 www.baidu.com/180.97.33.107
 */