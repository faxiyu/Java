package 单例;

/**
 * 
 * 饿汉单例
 * 
 */
public class Hungery {

	private static Hungery h = new Hungery();// 类初始化时立即加载,天然是效率安全，无法延迟加载

	private Hungery() {

	}
	//方法没有同步，调用效率高
	public static Hungery geth() {
		return h;
	}

}
