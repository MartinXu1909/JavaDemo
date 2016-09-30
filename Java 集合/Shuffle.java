/* 
 ʹ�� Collections �� Collections.shuffle() ���������Ҽ���Ԫ�ص�˳��
*/
import java.util.*;

public class Shuffle{
	public static void main(String[] args){
		List<Integer> list =  new ArrayList<Integer>();
		for(int i = 0; i < 10; i++)
			list.add(new Integer(i));
		System.out.println("����ǰ��");
		System.out.println(list);
		for(int i = 1; i < 6; i++){
			System.out.println("�� " + i + " �δ��ң�");
			Collections.shuffle(list);
			System.out.println(list);
		}
	}
}
/* 
����ǰ��
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
�� 1 �δ��ң�
[8, 9, 1, 4, 5, 7, 6, 3, 2, 0]
�� 2 �δ��ң�
[2, 9, 5, 8, 1, 6, 0, 7, 3, 4]
�� 3 �δ��ң�
[9, 6, 4, 3, 7, 2, 0, 1, 5, 8]
�� 4 �δ��ң�
[4, 5, 9, 2, 1, 0, 8, 6, 7, 3]
�� 5 �δ��ң�
[9, 4, 8, 1, 2, 5, 3, 7, 0, 6]
 */