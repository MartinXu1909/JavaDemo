/* 
使用多个 catch 来处理链试异常 
*/

public class Main{
	public static void main(String[] args) throws Exception {
		int  n = 20, result = 0;
		try{
			result = n/0;
			System.out.println("结果为：" + result);
		}
		catch(ArithmeticException ex){
			System.out.println("触发算数异常：" + ex);
			try{
				throw new NumberFormatException();
			}
			catch (NumberFormatException ex1){
				System.out.println("手动抛出链式异常：" + ex1);
			}
		}
	}
}
/* 
触发算数异常：java.lang.ArithmeticException: / by zero
手动抛出链式异常：java.lang.NumberFormatException
 */