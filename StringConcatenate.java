/* 
 ͨ�� "+" ��������StringBuffer.append() �����������ַ��������Ƚ�������
*/

public class StringConcatenate{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		for(int i=0;i<5000000;i++){
			String result = "This is " + "testing the "
			+ "difference " + "between "
			+ "String " + "and " + "StringBuffer ";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("�ַ�������" 
		+ " - ʹ�� + ������ ��"
		+ (endTime - startTime) + "����");
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<5000000;i++){
			StringBuffer result = new StringBuffer();
			result.append("This is ");
			result.append("testing the ");
			result.append("difference ");
			result.append("between ");
			result.append("String ");
			result.append("and ");
			result.append("StringBuffer ");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("�ַ�������" 
		+ " - ʹ�� StringBuffer ��" 
		+ (endTime1 - startTime1) + "����");
	}
}
/* 
�ַ������� - ʹ�� + ������ ��16����
�ַ������� - ʹ�� StringBuffer ��437����
 */