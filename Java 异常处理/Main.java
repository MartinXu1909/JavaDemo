/* 
ʹ�ö�� catch �����������쳣 
*/

public class Main{
	public static void main(String[] args) throws Exception {
		int  n = 20, result = 0;
		try{
			result = n/0;
			System.out.println("���Ϊ��" + result);
		}
		catch(ArithmeticException ex){
			System.out.println("���������쳣��" + ex);
			try{
				throw new NumberFormatException();
			}
			catch (NumberFormatException ex1){
				System.out.println("�ֶ��׳���ʽ�쳣��" + ex1);
			}
		}
	}
}
/* 
���������쳣��java.lang.ArithmeticException: / by zero
�ֶ��׳���ʽ�쳣��java.lang.NumberFormatException
 */