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
		hi.gg(); // 通过引用也可以访问static变量或static方法。不过，一般还 是使用类名.static成员名来访问。
		gg();
	}
}
