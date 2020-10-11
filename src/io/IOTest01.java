package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.print.DocFlavor.STRING;

/**
 * 第一个程序:理解操作步骤 1、创建源 2、选择流 3、操作 4、释放资源
 * 
 * @author 裴新
 *
 */
public class IOTest01 {

	public static void main(String[] args) {
		// 1、创建源
		File src = new File("abc.txt");
		// 2、选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
//			int temp = is.read();
//			while (temp != -1) {
//				System.out.println((char) temp);
//				temp = is.read();}
			byte[] car = new byte[1];
			int len = is.read(car);
			while(len!=-1) {
				for (byte b : car) {
					System.out.println(b);
				}
				String s = new String(car,0,len,"GBK");
				System.out.println(s);
				len = is.read(car);
			}
			String ms= "我";
			byte[] b = ms.getBytes("gbk");
			System.out.println(b.length);
			
			// 3、操作 (读取)
			// int data1 = is.read(); //第一个数据s
			// int data2 = is.read(); //第二个数据x
			// int data3 = is.read(); //第三个数据t
			// int data4 = is.read(); //????不是数据，文件的末尾返回-1
			// System.out.println((char)data1);
			// System.out.println((char)data2);
			// System.out.println((char)data3);
			// System.out.println(data4);
			// //4、释放资源
			// is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != is) {
					is.close();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
