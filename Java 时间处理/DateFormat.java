/* 
 ʹ�� SimpleDateFormat ��� format() ������ʱ���ת����ʱ��
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat{
	public static void main(String[] args){
		//��ȡ��ǰʱ���
		long timeStamp = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// ʱ���ת����ʱ��
		String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
		System.out.println(sd);
	}
}
/* 
2016-09-25
 */