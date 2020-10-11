package 抽象工厂;

public interface Tyre {
	void revolve();
}


class LuxTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("旋转不磨损");
		
	}
	
}

class LowTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("旋转磨损");
		
	}
	
}