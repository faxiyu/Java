package ���󹤳�;

public interface Engine {
	void start();
	void run();
	
}


class LuxEngine implements Engine{

	@Override
	public void start() {
		System.out.println("������");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ܵÿ�");
	}
	
}


class LowEngine implements Engine{

	@Override
	public void start() {
		System.out.println("������");
		
	}

	@Override
	public void run() {
		System.out.println("�ܵ���");
		
	}
	
}



