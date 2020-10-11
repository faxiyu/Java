package 建造者模式;

public class FxyDircetor implements AirShipDirector {

	private AirShipBuilder builder;

	public FxyDircetor(AirShipBuilder builder) {
		this.builder = builder;
	}



	@Override
	public AirShip directAirship() {
		Engine engine = builder.builderEngine();
		EscapeTower escapeTower = builder.builderEscapeTower();
		OrbitalModule orbitalModule = builder.builderOrbitalModule();
		AirShip a =  new AirShip();
		//装配飞船对象
		a.setEngine(engine);
		a.setEscapeTower(escapeTower);
		a.setOrbitalModule(orbitalModule);
		
		return a;
	}

}
