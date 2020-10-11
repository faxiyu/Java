package 单例;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Testdl {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		@SuppressWarnings("unchecked")
		Class<Hungery> h =  (Class<Hungery>) Class.forName("设计模式.Hungery");
		Constructor<Hungery> con = h.getDeclaredConstructor();
		con.setAccessible(true);
		Hungery h1 = con.newInstance();
		Hungery h2 = con.newInstance();
		System.out.println(h1);
		System.out.println(h2);
		
		
		Lan ll1= Lan.getl();
		Lan ll2 = Lan.getl();
		System.out.println(ll1);
		System.out.println(ll2);
		
		//通过反射直接构造对象
//		@SuppressWarnings("unchecked")
//		Class<Lan> l =  (Class<Lan>) Class.forName("设计模式.Lan");
//		Constructor<Lan> con1 = l.getDeclaredConstructor();
//		con1.setAccessible(true);
//		Lan l1 = con1.newInstance();
//		Lan l2 = con1.newInstance();
//		System.out.println(l1);
//		System.out.println(l2);
//		
		
		//反序列化
		FileOutputStream fl=  new FileOutputStream("j.txt");
		ObjectOutputStream bl = new ObjectOutputStream(fl);
		bl.writeObject(ll1);
		bl.close();
		
		ObjectInputStream il = new ObjectInputStream(new FileInputStream("j.txt"));
		Object b1= il.readObject();
		if(b1 instanceof Lan) {
			Lan cl1 = (Lan)b1;
		System.out.println(cl1);
		}
		
		
		
	}

}
