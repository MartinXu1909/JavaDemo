/* 
 ʹ���� String ��� indexOf() �������ַ����в������ַ������ֵ�λ�ã�
 ������ڷ����ַ������ֵ�λ�ã���һλΪ0������������ڷ��� -1��
*/

public class SearchStringEmp{
	public static void main(String[] args){
		String strOrig = "Hello readers";
		int intIndex = strOrig.indexOf("Hello");
		if(intIndex == -1){
			System.out.println("Hello not found");
		}else{
			System.out.println("Found Hello at index " + intIndex);
		}
	}
}
/* 
Found Hello at index 0
 */