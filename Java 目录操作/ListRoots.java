/* 
ʹ�� File ��� listRoots() ���������ϵͳ���и�Ŀ¼
*/
import java.io.*;

public class ListRoots{
	public static void main(String[] args){
		File[] roots = File.listRoots();
		System.out.println("ϵͳ���и�Ŀ¼��");
		for(int i = 0; i < roots.length; i++){
			System.out.println(roots[i].toString());
		}
	}
}
/* 
ϵͳ���и�Ŀ¼��
C:\
D:\
E:\
F:\
 */