/* 
 ʹ�� Vector ��� v.add() ������ Collection ��� Collections.max() ����ȡ���������Ԫ��
*/
import java.util.Collections;
import java.util.Vector;

public class CollectionMax{
	public static void main(String[] args){
		Vector v = new Vector();
        v.add(new Double("3.4324"));
        v.add(new Double("3.3532"));
		v.add(new Double("3.342"));
		v.add(new Double("3.349"));
		v.add(new Double("2.3"));
		Object obj = Collections.max(v);
		System.out.println("���Ԫ���ǣ�"+obj);
	}
}
/* 
���Ԫ���ǣ�3.4324
 */