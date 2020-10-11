package ¼òµ¥¹¤³§;



public class CarFactory {

	public static Car creat(String type) {
		if("aodi".equals(type)) {
			return new Aodi();
		}else {
			return new Benchi();
		}
	}

	
	public static Car creataodi() {
		// TODO Auto-generated method stub
		return new Aodi();
	}
	  public static Car creatbenchi() {
		// TODO Auto-generated method stub
		  return new Benchi();
	}
}
