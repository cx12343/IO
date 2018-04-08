package Others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {
	public static void test01() throws IOException {
		employees a =new employees("ÕÅÈý",5000);
		File file=new File ("D:/c.txt");
		ObjectOutputStream dos=new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(file)));
		dos.writeObject(a);
		dos.flush();
		dos.close();
	}
	public static void test02() throws IOException, ClassNotFoundException {
		File a=new File("D:/c.txt");
		ObjectInputStream dio=new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(a)));
		  employees xx= (employees)dio.readObject();
		System.out.println(xx.getName());
		System.out.println(xx.getSalay());
	}
	public static void main(String[] args) {
		try {
			test01();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			test02();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
