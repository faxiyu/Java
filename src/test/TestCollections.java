package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections辅助类的使用
 * Collection是接口，Collections是工具类
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
		Collections.shuffle(list);	//随机排列list中的元素
		System.out.println(list);
		
		Collections.reverse(list); //逆序排列
		System.out.println(list);
		
		Collections.sort(list);		//按照递增的方式排序。自定义的类使用：Comparable接口。
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "1gao:")); 	//二分法查找，或者：折半查找
		Collections.binarySearch(list, "5gao:");
		
	}
}
