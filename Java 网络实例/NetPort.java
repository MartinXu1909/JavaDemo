/* 
 如何检测端口是否已经使用
*/
import java.net.*;
import java.io.*;

public class NetPort{
	public static void main(String[] args){
		Socket Skt; 
		String host = "localhost";
		if(args.length > 0){
			host = args[0];
		}
		for(int i = 0; i < 1024; i++){
			try{
				System.out.println("查看 " + i);
				Skt = new Socket(host, i);
				System.out.println("端口 " + i + " 已被使用");
			}
			catch (UnknownHostException e){
				System.out.println("Exception occured" + e);
				break;
			}
			catch (IOException e){
				
			}
		}
	}
}
/* 
……
查看 17
查看 18
查看 19
查看 20
查看 21
端口 21 已被使用
查看 22
查看 23
查看 24
……
 */