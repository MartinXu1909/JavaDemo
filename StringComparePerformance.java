/* 
 演示了通过两种方式创建字符串，并测试其性能
*/

public class StringComparePerformance{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		for(int i=0;i<5000000;i++){
			String s1 = "hello";
			String s2 = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("通过String关键词常见字符串" 
		+ " : " + (endTime - startTime) + "毫秒");
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<5000000;i++){
			String s3 = "hello";
			String s4 = "hello";
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("通过String关键词常见字符串" 
		+ " : " + (endTime1 - startTime1) + "毫秒");
	}
}
/* 
通过String关键词常见字符串 : 3毫秒
通过String关键词常见字符串 : 1毫秒
 */