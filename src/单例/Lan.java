package ����;

import java.io.Serializable;

/**
 * 
 * ��������
 * ��Դ�����ʸ�
 * ����Ч�ʵ�
 * �ӳټ���
 *
 */
public class Lan implements Serializable{

	private static Lan l ;
	private Lan() {
		if(l != null) {
			throw new RuntimeException();//��ֹ����
		}
	}
	public static synchronized  Lan getl() {
		if(l == null ) {
			l= new Lan();
		}
		return l;
	}
	
	//��ֹ���л�
	private Object readResolve() {
		return l;

	}
}
