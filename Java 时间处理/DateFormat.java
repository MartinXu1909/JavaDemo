/* 
 使用 SimpleDateFormat 类的 format() 方法将时间戳转换成时间
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat{
	public static void main(String[] args){
		//获取当前时间戳
		long timeStamp = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 时间戳转换成时间
		String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
		System.out.println(sd);
	}
}
/* 
2016-09-25
 */