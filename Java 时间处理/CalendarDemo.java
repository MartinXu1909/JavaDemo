/* 
ʹ�� Calendar ���������ݡ��·ݵ� 
*/
import java.util.Calendar;

public class CalendarDemo{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("��ǰʱ�䣺" + cal.getTime());
		System.out.println("���ڣ�" + day);
		System.out.println("�·ݣ�" + day);
		System.out.println("��ݣ�" + day);
		// ������Ϊһ�ܵĵ�һ�����Ϊ 1������һ���Ϊ 2���Դ�����
		System.out.println("һ�ܵĵڼ��죺" + dow);
		System.out.println("һ���еĵڼ��죺" + dom);
		System.out.println("һ���еĵڼ��죺" + doy);
	}
}
/* 
��ǰʱ�䣺Sun Sep 25 16:24:01 CST 2016
���ڣ�25
�·ݣ�25
��ݣ�25
һ�ܵĵڼ��죺1
һ���еĵڼ��죺25
һ���еĵڼ��죺269
 */