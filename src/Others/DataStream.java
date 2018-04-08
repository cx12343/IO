package Others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	//数据到 文件
	public static void test01() throws IOException {
		String str="今个老百姓真啊真高兴";
		int a =100;
		double b= 10.5;
		File file=new File ("D:/c.txt");
		DataOutputStream dos=new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(file)));
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeUTF(str);
		dos.flush();
		dos.close();
	}
	public static void test02() throws IOException {
		File a=new File("D:/c.txt");
		DataInputStream dio=new DataInputStream(
				new BufferedInputStream(
						new FileInputStream(a)));
		int z=dio.readInt();
		double x= dio.readDouble();
		String xx= dio.readUTF();
		System.out.println(xx);
	}
public static void main(String[] args) {
	try {
		test02();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
