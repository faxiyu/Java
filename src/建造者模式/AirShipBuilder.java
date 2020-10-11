package 建造者模式;

public interface AirShipBuilder {
	OrbitalModule builderOrbitalModule();
	Engine builderEngine();
	EscapeTower builderEscapeTower();
}
