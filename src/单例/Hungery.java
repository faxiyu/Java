package ����;

/**
 * 
 * ��������
 * 
 */
public class Hungery {

	private static Hungery h = new Hungery();// ���ʼ��ʱ��������,��Ȼ��Ч�ʰ�ȫ���޷��ӳټ���

	private Hungery() {

	}
	//����û��ͬ��������Ч�ʸ�
	public static Hungery geth() {
		return h;
	}

}
