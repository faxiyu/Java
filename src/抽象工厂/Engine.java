package 抽象工厂;

public interface Engine {
	void start();
	void run();
	
}


class LuxEngine implements Engine{

	@Override
	public void start() {
		System.out.println("启动快");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("跑得快");
	}
	
}


class LowEngine implements Engine{

	@Override
	public void start() {
		System.out.println("启动慢");
		
	}

	@Override
	public void run() {
		System.out.println("跑得慢");
		
	}
	
}



