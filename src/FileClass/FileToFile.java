package FileClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToFile {
public static void main(String[] args) {
	File read=new File("D:/a.mp3");
	File write = new File("D:/b.mp3");
	FileInputStream r =null;
	FileOutputStream w =null;
	if(!write.exists()) {
		try {
			write.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	try {
		 r = new FileInputStream(read);
		 w =new FileOutputStream(write);
		byte []a =new byte[1000];
		//r.read(a);
		//int len =0;
		while(-1!= r.read(a)) {
			w.write(a);
	
		}
		w.flush();
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
