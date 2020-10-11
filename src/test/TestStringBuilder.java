package test;

/**
 * 测试StringBuilder、StringBuffer可变字符序列
 * @author Administrator
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		String  str;
		
		//StringBuilder线程不安全，效率高（一般使用它）；StringBuffer线程安全，效率低。
		StringBuilder  sb = new StringBuilder("abcdefg");
		for (int i = 0; i < sb.length(); i++) {
			System.out.println(sb.deleteCharAt(1));
			
		}
		
	}
}
