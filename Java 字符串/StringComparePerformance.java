/* 
 ��ʾ��ͨ�����ַ�ʽ�����ַ�����������������
*/

public class StringComparePerformance{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		for(int i=0;i<5000000;i++){
			String s1 = "hello";
			String s2 = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ͨ��String�ؼ��ʳ����ַ���" 
		+ " : " + (endTime - startTime) + "����");
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<5000000;i++){
			String s3 = "hello";
			String s4 = "hello";
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("ͨ��String�ؼ��ʳ����ַ���" 
		+ " : " + (endTime1 - startTime1) + "����");
	}
}
/* 
ͨ��String�ؼ��ʳ����ַ��� : 3����
ͨ��String�ؼ��ʳ����ַ��� : 1����
 */