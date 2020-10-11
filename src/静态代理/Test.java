package ¾²Ì¬´úÀí;

public class Test {

	public static void main(String[] args) {
		
		Star z = new RealStar();
		Star d = new ProxyStar(z);
		d.sing();
	}

}
