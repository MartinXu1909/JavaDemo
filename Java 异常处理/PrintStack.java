/* 
 ʹ���쳣��� printStack() ��������ȡ��ջ��Ϣ
*/

public class PrintStack{
	public static void main(String[] args){
		int array[] = {20, 20, 40};
		int num1 = 15, num2 = 10;
		int result = 10;
		try{
			result = num1/num2;
			System.out.println("���Ϊ��" + result);
			for(int i = 5; i >= 0; i--){
				System.out.println("�����Ԫ��ֵΪ��" + array[i]);
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
/* 
���Ϊ��1
java.lang.ArrayIndexOutOfBoundsException: 5
        at PrintStack.main(PrintStack.java:15)
 */