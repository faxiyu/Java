package ��̬����;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StarHandle sh = new StarHandle("�ܽ���");
		Star d = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, sh);
		d.sing();
		d.bookTicket();
	}

}
