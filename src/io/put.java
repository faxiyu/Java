package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class put {

	public static void main(String[] args) {
		File src = new File("abc.txt");
		Scanner scan = new Scanner(System.in);
		
		OutputStream op =  null;
		try {
			op = new FileOutputStream(src,false);//trueΪ׷��
			String msg="fxywyj";
			byte[] datas = msg.getBytes();//����
			op.write(datas);
			op.flush();//ˢ�£�����פ���ڴ�
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(null!=op) {
				try {
					op.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
