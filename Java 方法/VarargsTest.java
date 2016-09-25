/* 
����ʵ����ʾ����������ط�����ʹ�ÿɱ���� 
*/

public class VarargsTest{
	static void vaTest(int... no){
		System.out.print("vaTest(int...): " 
		+ "����������"  + no.length + " ���ݣ�");
		for(int n : no)
			System.out.print(n + " ");
		System.out.println();
	}
	static void vaTest(boolean... bl){
		System.out.print("vaTest(boolean...): " 
		+ "����������"  + bl.length + " ���ݣ�");
		for(boolean b : bl)
			System.out.print(b + " ");
		System.out.println();
	}
	static void vaTest(String msg, int... no){
		System.out.print("vaTest(String, int...): " 
		+ msg + "����������"  + no.length + " ���ݣ�");
		for(int n : no)
			System.out.print(n + " ");
		System.out.println();
	}
	public static void main(String[] args){
		vaTest(1, 2, 3);
		vaTest("���ԣ�", 10, 20);
		vaTest(true, false, false);
	}
}
/* 
vaTest(int...): ����������3 ���ݣ�1 2 3
vaTest(String, int...): ���ԣ�����������2 ���ݣ�10 20
vaTest(boolean...): ����������3 ���ݣ�true false false
 */