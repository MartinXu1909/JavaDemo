/* 
�������أ�Overloading���Ķ��壺��������������ķ�������ͬ����������һ�£���ô����˵һ����������һ�����������ء� ����˵�����£�
1.��������ͬ
2.�����Ĳ������ͣ�����˳��������һ�ͬ
3.�����ķ������Ϳ��Բ���ͬ
4.���������η����Բ���ͬ
5.main����Ҳ���Ա�����
 
 ����ʵ����ʾ��������� MyClass ��� info ����
*/

class MyClass{
	int height;
	MyClass(){
		System.out.println("�޲������캯��");
		height = 4;
	}
	MyClass(int i){
		System.out.println("���Ӹ߶�Ϊ " + i + " ��");
		height = i;
	}
	void info(){
		System.out.println("���Ӹ߶�Ϊ " + height + " ��");
	}
	void info(String s){
		System.out.println(s + "�����Ӹ߶�Ϊ " + height + " ��");
	}
}
public class MainClass{
	public static void main(String[] args){
		MyClass t = new MyClass(3);
		t.info();
		t.info("���ط���");
		// ���ع��캯��
		new MyClass();
	}
}
/* 
���Ӹ߶�Ϊ 3 ��
���Ӹ߶�Ϊ 3 ��
���ط��������Ӹ߶�Ϊ 3 ��
�޲������캯��
 */