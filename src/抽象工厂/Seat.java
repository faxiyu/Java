package 抽象工厂;

public interface Seat {
	void message();
}

class LuxSeat implements Seat{

	@Override
	public void message() {
		System.out.println("可以自动按摩");
		
	}
	
}

class LowSeat implements Seat{

	@Override
	public void message() {
		System.out.println("不能自动按摩");
		
	}
	
}