package ������ģʽ;
/**
 * ������
 * @author 14257
 *
 */
public class Adpater 
				//extends Adpatee    //ͨ���̳�ʵ������ 
						implements Target {

	private Adpatee a ;
	
	
	@Override
	public void handleRed() {
		a.request();
		
	}
	public Adpater(Adpatee a ) {
		this.a=a;
		
	}

//	@Override
//	public void handleRed() {
//		super.request();
//		
//	}
	
}
