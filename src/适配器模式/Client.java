package ������ģʽ;



/**
 * ʹ�õ���
 * @author 14257
 *
 */
public class Client {
	public void test(Target t) {
		t.handleRed();

	}
	
	public static void main(String[] args) {
		Client c = new Client();
		//�̳з�������
//		Adpater a = new Adpater();
//		Target t = new Adpater();
//		c.test(a);
//		c.test(t);
		//˽��
		Adpatee a = new Adpatee();
		Adpater ar = new Adpater(a);
		c.test(ar);
	}
}
