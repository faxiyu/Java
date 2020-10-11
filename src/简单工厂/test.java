package 简单工厂;
/***
 * 
 * 简单工厂调动
 *
 */
public class test {

	public static void main(String[] args) {
		Car c = CarFactory.creat("aodi");
		c.run();
	}
}
