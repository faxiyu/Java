package test;

public class TestExtends {

	public static void main(String[] args) {
		Mammal m1 = new Mammal();
		Animal1 m2 = new Mammal();
		System.out.println(m2.eyes);
		m1.puru();
		m1.eat();
		m2.eat();
	}
}

class Animal1 {
	String eyes = "眼睛";
	String name = "无名";

	public void eat() {
		System.out.println("动物吃东西！");
	}
}

class Mammal extends Animal1 { // 哺乳
	String eyes;
	@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("xsad");
		}
	public void puru() {
		System.out.println(eyes+" "+name+"小动物吃奶！");
	}
}