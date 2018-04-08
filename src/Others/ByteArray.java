package Others;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ByteArray {
public static void main(String[] args) throws IOException {
	
	test02( test01() );
}
	public static byte[] test01() throws IOException {
		String str="·ÉÈ÷¸»ÉÌ´ó¼Ö";
		byte [] a= str.getBytes();
		byte[] get=new byte[1024];
		ByteArrayInputStream aa = new ByteArrayInputStream(a);
		int  len=0; 
		while(-1!=(len=aa.read(get))) {
			String zz=new String(get,0,get.length);
			System.out.println(zz);
		}
	
		return get;
	}
	public static void test02 (byte[] info)throws IOException {
		byte [] cun;
		ByteArrayOutputStream b= new ByteArrayOutputStream();
		//byte[] info = new String("dsfsafsda").getBytes();
		b.write(info, 0,info.length );
		cun=b.toByteArray();
		System.out.println(new String(cun,0,cun.length));
	}	
}
