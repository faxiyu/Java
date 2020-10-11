package 建造者模式;

public class FxyBuilder implements AirShipBuilder {

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("fxy轨道舱");
	}

	@Override
	public Engine builderEngine() {
		// TODO Auto-generated method stub
		System.out.println("构建发动机");
		return new Engine("fxy发动机");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		// TODO Auto-generated method stub
		System.out.println("构建逃逸仓");
		return new EscapeTower("fxy逃逸仓");
	}

}
