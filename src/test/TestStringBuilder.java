package test;

/**
 * ����StringBuilder��StringBuffer�ɱ��ַ�����
 * @author Administrator
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		String  str;
		
		//StringBuilder�̲߳���ȫ��Ч�ʸߣ�һ��ʹ��������StringBuffer�̰߳�ȫ��Ч�ʵ͡�
		StringBuilder  sb = new StringBuilder("abcdefg");
		for (int i = 0; i < sb.length(); i++) {
			System.out.println(sb.deleteCharAt(1));
			
		}
		
	}
}
