package ��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandle implements InvocationHandler {
	
	Star s;
	public StarHandle(String name) {
		 s = new RealStar(); 
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ԤԼ");
		if(method.getName().equals("sing")) {
			Object invoke = method.invoke(s, args);
		}
		Object invoke = method.invoke(s, args);
		System.out.println("��¼");
		// TODO Auto-generated method stub
		return invoke;
	}

}
