package test;

public class TestPolym {
	public static void main(String[] args) {
		Animal animal = new Dog(); // ���Ͽ����Զ�ת��
		System.out.println(animal.age); // ���Ե���ʱ����Ȼ�ǻ������ �ԡ�����û�ж�̬��
		animal.shout();
		animalCry(new Dog());
		// ���ľ�������һ����͵�����һ����ķ������������˳���Ŀ���չ�ԡ�
		// ���û�ж�̬������������Ҫд�ܶ����صķ������������һ�ֶ������
		// Ҫ����һ�ֶ���ĺ��з������ǳ��鷳��
		// ���˶�̬��ֻ��Ҫ���������̳�Animal����Ϳ����ˡ�
		animalCry(new Cat());
		Dog dog = (Dog) animal; // ��д����ʱ��������������ʱ���͵ķ� ����ֻ�ܽ�������ת������Ȼͨ�����������ļ�顣
		dog.gnawBone();
		System.out.println(dog instanceof Animal);
		System.out.println(animal instanceof Cat);
		System.out.println(animal instanceof Dog);
		Outer o1= new Outer();
	}

	static void animalCry(Animal a) {
		a.shout();
		System.out.println("cry" + a.age);
	}
}

class Animal {
	int age = 10;

	public void shout() {
		System.out.println("����һ����");
	}
}

class Dog extends Animal {
	int age = 28;

	public Dog() {
		super.age = 28;
	}

	public void shout() {
		System.out.println("��������");
	}

	public void gnawBone() {
		System.out.println("���ڿй�ͷ");
	}
}

class Cat extends Animal {
	int age = 18;

	public void shout() {
		System.out.println("����������");
	}
}

class Outer {
	int outer_i = 100;

	void test() {
		Inner in = new Inner();
		in.display();
		System.out.println(in.a);
	}

	class Inner {
		int a = 5;

		void display() {
			System.out.println("display: outer_i = " + outer_i);
		}
	}
}