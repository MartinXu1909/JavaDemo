/* 
ʹ�� Date �༰ SimpleDateFormat ��� format(date) �����������ǰʱ��
 */
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class MainDate{
	public static void main(String[] args){
		// ��ʽ��ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat();
		// aΪam/pm�ı��
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
		// ��ȡ��ǰʱ��
		Date date = new Date();
		// ����Ѹ�ʽ��������ʱ�䣨24Сʱ�ƣ�
		System.out.println("����ʱ�䣺" + sdf.format(date));
	}
}
 /* 
����ʱ�䣺2016-09-25 16:08:30 ����
 */