package ���󹤳�;

public interface Tyre {
	void revolve();
}


class LuxTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("��ת��ĥ��");
		
	}
	
}

class LowTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("��תĥ��");
		
	}
	
}