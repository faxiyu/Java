package ¹¤³§;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new AodiFactory().creatcar();
		c.run();
		Car c1 = new BenchiFactory().creatcar();
		c1.run();
	}

}
