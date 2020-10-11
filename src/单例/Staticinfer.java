package 单例;
/**
 * 
 * 静态内部类
 *线程安全
 *调用效率高
 *延迟加载
 *
 */
public class Staticinfer {
	private Staticinfer () {
	}
	private static  class Infer{
		private static Staticinfer sti = new Staticinfer();
	}
	public static Staticinfer gets() {
		return Infer.sti;
		
	}
	
}
