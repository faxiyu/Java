package test;

public class TestStatic {
	int a;
	static int width;
	static {
		System.out.println("success");
	}
	static void gg() {
		System.out.println("gg");
	}

	void tt() {
		System.out.println("tt");
	}

	public static void main(String[] args) {
		TestStatic hi = new TestStatic();
		TestStatic.width = 2;
		TestStatic.gg(); // gg();
		hi.gg(); // ͨ������Ҳ���Է���static������static������������һ�㻹 ��ʹ������.static��Ա�������ʡ�
		gg();
	}
}
