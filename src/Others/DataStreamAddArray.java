package Others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataStreamAddArray {
	//数据到 文件
		public static byte[] test01() throws IOException {
		String str="今个老百姓真啊真高兴";
		int a =100;
		double b= 10.5;
		byte [] cun;
		ByteArrayOutputStream aos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(
				new BufferedOutputStream(aos));
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeUTF(str);
		dos.flush();
		cun=aos.toByteArray();
		aos.close();
		dos.close();
		return cun;
	}
	public static void test02(byte [] cun) throws IOException {
		DataInputStream dio=new DataInputStream(
				new BufferedInputStream(
						new ByteArrayInputStream(cun)));
		int z=dio.readInt();
		double x= dio.readDouble();
		String xx= dio.readUTF();
		System.out.println(xx);
	}
	public static void main(String[] args) {
		try {
			test02(test01());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
