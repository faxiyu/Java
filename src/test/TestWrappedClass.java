package test;

/**
 * ���԰�װ��
 * Integer���ʹ�á�������װ���÷����ƣ������Լ�ѧ��
 * @author 
 *
 */
public class TestWrappedClass {
	public static void main(String[] args) {
		//������������ת�ɰ�װ�����
		Integer   a  = new  Integer(3);
		Integer   b  = Integer.valueOf(30);   

		//�Ѱ�װ�����ת�ɻ�����������
		int   c  =  b.intValue();
		double d = b.doubleValue();
		
		//���ַ���ת�ɰ�װ�����
		Integer  e = new  Integer("9999");
		Integer  f = Integer.parseInt("999888");
		
		//�Ѱ�װ�����ת���ַ���
		String   str = f.toString();    //""+f
		
		//�����ĳ���
		System.out.println("int��������������"+Integer.MAX_VALUE);
		System.out.println(b);
		System.out.println(a);
		System.out.println(c+"  "+d+" "+e+" "+f+" "+str);
		String v="0123456789";
		String w="aa";
		if (v==w) {
			System.out.println("==");
		}
		if(v.equals(w)) {
			System.out.println("equal");
		}
		System.out.println(v.charAt(0));
		System.out.println(v.length());
	}
}
