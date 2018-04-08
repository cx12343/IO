package FileClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	public void fileCopy(File read,File write) throws IOException {
		FileInputStream r =null;
		FileOutputStream w =null;
		if(!write.exists()) {
				write.createNewFile();
		}
			 r = new FileInputStream(read);
			 w =new FileOutputStream(write);
			byte []a =new byte[1000];
			if(!read.exists() && !write.exists()) {
				throw new IOException("ÎÄ¼þÎ»ÖÃ´íÎó");
			}
			while(-1!= r.read(a)) {
				w.write(a);
				System.out.println("00000");
			}
			w.flush();
			r.close();
			w.close();		
		}
	public void fileCopy(String str1,String str2) throws IOException {
		File read=new File(str1);
		File write = new File(str2);
		fileCopy(read,write);
	
	}
	public static void main(String[] args) {
		try {
			new FileUtil().fileCopy("D:/a.mp3","D:/b.mp3");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

