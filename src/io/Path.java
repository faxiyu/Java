package io;

import java.io.File;
import java.io.IOException;

public class Path {

	public static void main(String[] args) throws IOException {
		String path = "D:\\WorkPlace\\基础\\8D2FFB0707C266FCD1B90F3F6B214016.jpg";
		// 1.建议
		path = "D:/WorkPlace/基础/8D2FFB0707C266FCD1B90F3F6B214016.jpg";
		// 2.常量拼接
		path = "D:" + File.separator + "WorkPlace" + File.separator + "基础" + File.separator
				+ "8D2FFB0707C266FCD1B90F3F6B214016.jpg";
		System.out.println(path);

		// 构建对象
		File src = new File(path);
		File src1 = new File("D:/WorkPlace/基础", "8D2FFB0707C266FCD1B90F3F6B214016.jpg");
		File src2 = new File(new File("D:/WorkPlace/基础"), "8D2FFB0707C266FCD1B90F3F6B214016.jpg");

		System.out.println(src1.length() + src2.length());// 返回文件的字节数，其余为0

		System.out.println(System.getProperty("user.dir"));
		File src3 = new File("8D2FFB0707C266FCD1B90F3F6B214016.jpg");
		System.out.println(src.getAbsolutePath());
		System.out.println(src3.getPath());// getname(),getparent()
		System.out.println(src.getParentFile().getName());

		File src4 = new File("D:/WorkPlace/基础/io.txt");
		boolean flag = src4.createNewFile();// 创建文件
		if (flag) {
			System.out.println("创建成功");
		}

		File src5 = new File("D:/WorkPlace/基础/gg.txt");
		flag = src5.delete();// 删除
		System.out.println(flag);

		/**
		 * exists()是否存在 isFile()是否文件 isDirector()是否文件夹
		 */

		File src6 = new File("D:/WorkPlace/基础/dir/test");
		flag = src6.mkdirs();// 上级目录可以不存在
		System.out.println(flag);

		File src7 = new File("D:/WorkPlace/基础");
		String[] fn = src7.list();// 下级名称
		for (String string : fn) {
			System.out.println(string);
		}
		System.out.println("------------------");
		File[] fd = src7.listFiles();// 下级对象
		for (File fl : fd) {
			System.out.println(fl.getPath());
		}

		File[] root = src7.listRoots();
		for (File file : root) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("============================");
		printname(src7);
		count(src7);
		System.out.println(length);
		
		src.delete();
		src2.delete();
		src1.delete();
		src3.delete();
		src4.delete();
		src6.delete();

	}

	public static void printname(File f) {
		if (null == f || ! f.exists()) {
			return;
		} else if (f.isDirectory()) {
			File[] fl = f.listFiles();
			System.out.println(f.getName()+"****************");
			for (File fd : fl) {
				System.out.println(fd.getName());
				printname(fd);
			}System.out.println(f.getName()+"\\\\\\\\\\\\\\\\\\");
		}

	}
	private static int length = 0;
	public static void count(File f) {
		if (f.isDirectory()) {
			File[] fl = f.listFiles();
			for (File fd : fl) {
				count(fd);
			}
		}else {
			length+=f.length();
		}
	}

}
