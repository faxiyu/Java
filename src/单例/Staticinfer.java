package ����;
/**
 * 
 * ��̬�ڲ���
 *�̰߳�ȫ
 *����Ч�ʸ�
 *�ӳټ���
 *
 */
public class Staticinfer {
	private Staticinfer () {
	}
	private static  class Infer{
		private static Staticinfer sti = new Staticinfer();
	}
	public static Staticinfer gets() {
		return Infer.sti;
		
	}
	
}
