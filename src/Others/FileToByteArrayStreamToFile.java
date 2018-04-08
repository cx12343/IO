package Others;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileToByteArrayStreamToFile {
//File-->ByteArrayStream
	public static byte[] test01() throws IOException {
		File a= new File("D:/a.txt");
		byte[] cun;
		byte[] temp= new byte [1024];
		InputStream aa=new FileInputStream(a);
		ByteArrayOutputStream bb=new ByteArrayOutputStream();
		while(-1!= aa.read(temp)) {
			bb.write(temp);
		}
		cun=bb.toByteArray();
		aa.close();
		bb.close();
		return cun;
	}
	public static void test02(byte [] cun) throws IOException {
		byte [] temp =new byte [1024];
		File b=new File ("D:/b.txt");
		OutputStream os=new FileOutputStream(b);
		ByteArrayInputStream isa=new ByteArrayInputStream(cun);
		while(-1!=isa.read(temp)) {
			os.write(temp);
		}
		isa.close();
		os.close();
		
		
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
