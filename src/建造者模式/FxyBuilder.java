package ������ģʽ;

public class FxyBuilder implements AirShipBuilder {

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("���������");
		return new OrbitalModule("fxy�����");
	}

	@Override
	public Engine builderEngine() {
		// TODO Auto-generated method stub
		System.out.println("����������");
		return new Engine("fxy������");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		// TODO Auto-generated method stub
		System.out.println("�������ݲ�");
		return new EscapeTower("fxy���ݲ�");
	}

}
