/* 
 使用 catch 来处理异常的方法 
*/

public class Catch{
	public static void main(String[] args){
		int array[] = {20, 20, 40};
		int num1 = 15, num2 = 10;
		int result = 10;
		try{
			result = num1/num2;
			System.out.println("结果为：" + result);
			for(int i = 5; i >= 0; i--){
				System.out.println("数组的元素值为：" + array[i]);
			}
		}
		catch (Exception e){
			System.out.println("触发异常 ：" + e);
		}
	}
}
/* 
结果为：1
触发异常 ：java.lang.ArrayIndexOutOfBoundsException: 5
 */