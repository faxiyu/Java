package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections�������ʹ��
 * Collection�ǽӿڣ�Collections�ǹ�����
 * @author 
 *
 */
public class TestCollections {
	public static void main(String[] args) {
		List<String>  list  = new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add(i+"gao:");
		}
		list.add(5+"gao");
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
		Collections.shuffle(list);	//�������list�е�Ԫ��
		System.out.println(list);
		
		Collections.reverse(list); //��������
		System.out.println(list);
		
		Collections.sort(list);		//���յ����ķ�ʽ�����Զ������ʹ�ã�Comparable�ӿڡ�
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "1gao:")); 	//���ַ����ң����ߣ��۰����
		Collections.binarySearch(list, "5gao:");
		
	}
}
