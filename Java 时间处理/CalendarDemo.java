/* 
使用 Calendar 类来输出年份、月份等 
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
		
		System.out.println("当前时间：" + cal.getTime());
		System.out.println("日期：" + day);
		System.out.println("月份：" + day);
		System.out.println("年份：" + day);
		// 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
		System.out.println("一周的第几天：" + dow);
		System.out.println("一月中的第几天：" + dom);
		System.out.println("一年中的第几天：" + doy);
	}
}
/* 
当前时间：Sun Sep 25 16:24:01 CST 2016
日期：25
月份：25
年份：25
一周的第几天：1
一月中的第几天：25
一年中的第几天：269
 */