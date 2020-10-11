package 原型模式;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 浅克隆
 */

import java.util.Date;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

		Date d = new Date(12312321331L);
		Sheep s1 = new Sheep("多利", d);
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());

		//
		//
		// Sheep s2 = (Sheep) s1.clone();

		// 使用序列化反序列化进行深复制
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		oos.writeObject(s1);
		byte[] b = bos.toByteArray();

		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		ObjectInputStream ois = new ObjectInputStream(bis);

		Sheep s2 = (Sheep) ois.readObject();

		d.setTime(1578972156564L);
		System.out.println(s1.getBirthday());
		
		System.out.println(s2);
		System.out.println(s2.getName());
		System.out.println(s2.getBirthday());

	}

}
