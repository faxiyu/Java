package io;

import java.io.UnsupportedEncodingException;

public class ContentEncode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg="��������ʹ��A";
		//���� :�ֽ�����
		byte[] datas=msg.getBytes();//Ĭ��GBK
		datas=msg.getBytes("UTF-8");
		msg = new String(datas,0,datas.length,"utf-8");//���룬
		System.out.println(msg);
		datas=msg.getBytes("UTF-16BE");
		System.out.println(datas.length);
		
	}

}
