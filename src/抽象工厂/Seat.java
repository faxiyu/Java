package ���󹤳�;

public interface Seat {
	void message();
}

class LuxSeat implements Seat{

	@Override
	public void message() {
		System.out.println("�����Զ���Ħ");
		
	}
	
}

class LowSeat implements Seat{

	@Override
	public void message() {
		System.out.println("�����Զ���Ħ");
		
	}
	
}