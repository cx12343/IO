package FileClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Wrints {
public static void main(String[] args) {
	File dest = new File("D:/a.txt");
	FileOutputStream a=null;
	try {
		 a =new FileOutputStream(dest,true);//׷�Ӿ���true ������false
		String str="̽������˰  \r\n";
		 byte [] b =str.getBytes();
		// int len =0;
		a.write(b, 0, b.length);
		a.flush();//ǿ��ˢ�³�ȥ
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(null != a) {
			try {
				a.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
}
