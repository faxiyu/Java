package ������ģʽ;

public class Test {

	public static void main(String[] args) {
		AirShipDirector ship = new FxyDircetor(new FxyBuilder());
		AirShip a = ship.directAirship();
		System.out.println(a.getEngine().getName());
	}

}
 