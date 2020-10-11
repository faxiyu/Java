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
			op = new FileOutputStream(src,false);//trueÎª×·¼Ó
			String msg="fxywyj";
			byte[] datas = msg.getBytes();//±àÂë
			op.write(datas);
			op.flush();//Ë¢ÐÂ£¬±ÜÃâ×¤ÁôÄÚ´æ
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
