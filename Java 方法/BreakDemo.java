/* 
 Java break ������ֱ��ǿ���˳���ǰ��ѭ��������ѭ�������κ���������ѭ���������ԡ�
 ����ʵ��ʹ���� break �ؼ�����������ǰѭ��
*/

public class BreakDemo{
	public static void main(String[] args){
		int[] intary = { 99, 12, 22, 34, 45, 67, 5678, 8990 };
		int no = 5678;
		int i = 0;
		boolean found = false;
		for( ; i < intary.length; i++){
			if(intary[i] == no){
				found = true;
				break;
			}
		}
		if(found){
			System.out.println(no + " Ԫ�ص�����λ���ڣ�" + i);
		}
		else{
			System.out.println(no + " Ԫ�ز���������");
		}
	}
}
/* 
5678 Ԫ�ص�����λ���ڣ�6
 */