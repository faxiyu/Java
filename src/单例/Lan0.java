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
public class Lan0 implements Serializable{

	private static Lan0 l ;
	private Lan0() {

	}
	//����ͬ��������Ч�ʵ�
	public static synchronized  Lan0 getl() {
		if(l == null ) {
			l= new Lan0();
		}
		return l;
	}
}