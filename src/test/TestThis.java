package test;

public class TestThis {
	int a, b, c;

	TestThis() {
		System.out.println("��Ҫnewһ��Hello����");
	}

	TestThis(int a, int b) { // Hello(); // //�������޷����ù��췽���ģ�
		this(); // �����޲εĹ��췽�������ұ���λ�ڵ�һ�У�
		a = a;// ���ﶼ��ָ�ľֲ����������ǳ�Ա����
		this.a = a;// �����������˳�Ա�����;ֲ�����. �������ռ��thisʹ������Ĵ������
		this.b = b;
	}

	TestThis(int a, int b, int c) {
		this(a, b); // �����޲εĹ��췽�������ұ���λ�ڵ�һ�У�
		this.c = c;
	}

	void sing() {
	}

	void chifan() {
		this.sing(); // sing();
		System.out.println(" "+this.a+this.b+"�����躰��ؼҳԷ���");
	}

	public static void main(String[] args) {
		TestThis hi = new TestThis(2, 3);
		hi.chifan();
	}
}
