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
public class Lan0 implements Serializable{

	private static Lan0 l ;
	private Lan0() {

	}
	//方法同步，调用效率低
	public static synchronized  Lan0 getl() {
		if(l == null ) {
			l= new Lan0();
		}
		return l;
	}
}