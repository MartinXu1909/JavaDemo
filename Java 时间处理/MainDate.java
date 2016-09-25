/* 
使用 Date 类及 SimpleDateFormat 类的 format(date) 方法来输出当前时间
 */
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class MainDate{
	public static void main(String[] args){
		// 格式化时间
		SimpleDateFormat sdf = new SimpleDateFormat();
		// a为am/pm的标记
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
		// 获取当前时间
		Date date = new Date();
		// 输出已格式化的现在时间（24小时制）
		System.out.println("现在时间：" + sdf.format(date));
	}
}
 /* 
现在时间：2016-09-25 16:08:30 下午
 */