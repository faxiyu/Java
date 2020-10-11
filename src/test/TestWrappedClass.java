package test;

/**
 * 测试包装类
 * Integer类的使用。其他包装类用法类似，课下自己学。
 * @author 
 *
 */
public class TestWrappedClass {
	public static void main(String[] args) {
		//基本数据类型转成包装类对象
		Integer   a  = new  Integer(3);
		Integer   b  = Integer.valueOf(30);   

		//把包装类对象转成基本数据类型
		int   c  =  b.intValue();
		double d = b.doubleValue();
		
		//把字符串转成包装类对象
		Integer  e = new  Integer("9999");
		Integer  f = Integer.parseInt("999888");
		
		//把包装类对象转成字符串
		String   str = f.toString();    //""+f
		
		//常见的常量
		System.out.println("int类型最大的整数："+Integer.MAX_VALUE);
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
