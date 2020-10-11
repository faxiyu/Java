package 单例;

import java.io.Serializable;

/**
 * 
 * 懒汉单例
 * 资源利用率高
 * 并发效率低
 * 延迟加载
 *
 */
public class Lan implements Serializable{

	private static Lan l ;
	private Lan() {
		if(l != null) {
			throw new RuntimeException();//防止反射
		}
	}
	public static synchronized  Lan getl() {
		if(l == null ) {
			l= new Lan();
		}
		return l;
	}
	
	//防止序列化
	private Object readResolve() {
		return l;

	}
}
