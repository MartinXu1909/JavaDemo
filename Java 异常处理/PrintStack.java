/* 
 使用异常类的 printStack() 方法来获取堆栈信息
*/

public class PrintStack{
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
			e.printStackTrace();
		}
	}
}
/* 
结果为：1
java.lang.ArrayIndexOutOfBoundsException: 5
        at PrintStack.main(PrintStack.java:15)
 */