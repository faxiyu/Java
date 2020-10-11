package ³éÏó¹¤³§;

public class LuxuryFactory implements CarFactory {

	@Override
	public Engine creatEngine() {
		// TODO Auto-generated method stub
		return new LuxEngine();
	}

	@Override
	public Seat creatSeat() {
		// TODO Auto-generated method stub
		return new LuxSeat();
	}

	@Override
	public Tyre craetTyre() {
		// TODO Auto-generated method stub
		return new LuxTyre();
	}

}
