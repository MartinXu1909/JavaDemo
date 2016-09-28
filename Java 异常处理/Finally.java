/* 
Java �е� Finally �ؼ�һ����tryһ��ʹ�ã��ڳ������try��֮��
���۳�������Ϊ�쳣����ֹ��������ʽ������ֹ�ģ�finally�������һ���ᱻִ�� ��

����ʵ����ʾ�����ʹ�� finally ͨ�� e.getMessage() �������쳣���Ƿ������쳣�� 
*/

public class Finally{
	public static void main(String[] args){
		new Finally().doTheWork();
	}
	public void doTheWork(){
		Object o = null;
		for(int i = 0; i < 5; i++){
			try{
				o = makeObj(i);
			}
			catch (IllegalArgumentException e){
				System.out.println("Error: (" + e.getMessage() + ").");
				return;
			}
			finally{
				System.out.println("����ִ�����");
				if(o == null)
					System.exit(0);
			}
			System.out.println(o);
		}
	}
	public Object makeObj(int type) throws IllegalArgumentException {
		if(type == 1)
			throw new IllegalArgumentException("����ָ�������ͣ�" + type);
		return new Object();
	}
}
/* 
����ִ�����
java.lang.Object@15db9742
Error: (����ָ�������ͣ�1).
����ִ�����
 */