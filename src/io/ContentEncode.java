package io;

import java.io.UnsupportedEncodingException;

public class ContentEncode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg="性命生命使命A";
		//编码 :字节数组
		byte[] datas=msg.getBytes();//默认GBK
		datas=msg.getBytes("UTF-8");
		msg = new String(datas,0,datas.length,"utf-8");//解码，
		System.out.println(msg);
		datas=msg.getBytes("UTF-16BE");
		System.out.println(datas.length);
		
	}

}
