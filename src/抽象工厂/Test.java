package ³éÏó¹¤³§;



public class Test {

	public static void main(String[] args) {
		CarFactory c1 = new LuxuryFactory();
		Engine en =c1.creatEngine();
		en.run();
		en.start();

	}

}
