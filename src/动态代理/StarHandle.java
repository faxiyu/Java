package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandle implements InvocationHandler {
	
	Star s;
	public StarHandle(String name) {
		 s = new RealStar(); 
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("预约");
		if(method.getName().equals("sing")) {
			Object invoke = method.invoke(s, args);
		}
		Object invoke = method.invoke(s, args);
		System.out.println("记录");
		// TODO Auto-generated method stub
		return invoke;
	}

}
