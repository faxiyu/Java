package test;

import java.util.Date;

/**
 * ����Date��ĳ����÷�
 * @author ���
 *
 */
public class TestDate {
	public static void main(String[] args) {
		
		Date d1= new Date(3000);
		System.out.println(d1);
		Date  d = new Date(2000);
		System.out.println(d);
		
		System.out.println(d.getTime()); 
		
		Date d2 = new Date();
		System.out.println(d2);
		System.out.println(d2.getTime());
		
		System.out.println(d2.after(d)); 
		
		
		//�Ժ��������ڴ���ʹ��Canlendar������
		Date d3 = new Date(2020-1970,3,30);		//2020��4��10��
		System.out.println(d3);
		
		
		
	}
}
