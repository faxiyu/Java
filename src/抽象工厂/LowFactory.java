package ³éÏó¹¤³§;

public class LowFactory  implements CarFactory{

	@Override
	public Engine creatEngine() {
		// TODO Auto-generated method stub
		return new LowEngine();
	}

	@Override
	public Seat creatSeat() {
		// TODO Auto-generated method stub
		return new LowSeat();
	}

	@Override
	public Tyre craetTyre() {
		// TODO Auto-generated method stub
		return new LowTyre();
	}
	
}
