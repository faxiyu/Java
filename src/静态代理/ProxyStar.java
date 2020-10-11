package ¾²Ì¬´úÀí;

public class ProxyStar implements Star {

	private Star s;
	public ProxyStar(Star s) {
		this.s=s;
	}
		
	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar confer");

	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar signcontarct");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		s.sing();
	}

	@Override
	public void coolectMoney() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar colectmoney");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar bookticket");
	}

}
