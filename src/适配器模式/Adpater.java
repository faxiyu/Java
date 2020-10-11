package 适配器模式;
/**
 * 适配器
 * @author 14257
 *
 */
public class Adpater 
				//extends Adpatee    //通过继承实现适配 
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
