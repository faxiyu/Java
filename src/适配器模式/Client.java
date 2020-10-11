package 适配器模式;



/**
 * 使用的类
 * @author 14257
 *
 */
public class Client {
	public void test(Target t) {
		t.handleRed();

	}
	
	public static void main(String[] args) {
		Client c = new Client();
		//继承方法调用
//		Adpater a = new Adpater();
//		Target t = new Adpater();
//		c.test(a);
//		c.test(t);
		//私有
		Adpatee a = new Adpatee();
		Adpater ar = new Adpater(a);
		c.test(ar);
	}
}
