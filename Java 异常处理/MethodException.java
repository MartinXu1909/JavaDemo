/* 
重载方法的异常处理 
*/

public class MethodException{
	double method(int i) throws Exception{
		return i/0;
	}
	boolean method(boolean b){
		return b;
	}
	static double method(int x, double y) throws Exception {
		return x + y;
	}
	static double method(double x, double y){
		return x + y -3;
	}
	public static void main(String[] args){
		MethodException me = new MethodException();
		try{
			System.out.println(method(10, 20.0));
			System.out.println(method(10.0, 20));
			System.out.println(method(10.0, 20.0));
			System.out.println(me.method(10));
		}
		catch (Exception ex){
			System.out.println("exception occoure: " + ex);
		}
	}
}
/* 
30.0
27.0
27.0
exception occoure: java.lang.ArithmeticException: / by zero
 */