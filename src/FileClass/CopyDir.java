package FileClass;
/**
 * �ļ��п���
 * �ؼ� ����Ŀ���ļ����ļ���·��
 */
import java.io.File;
import java.io.IOException;

public class CopyDir {
public static void main(String[] args) {
	File read=new File("D:/CloudMusic");
	File write = new File("D:/3");
	copy(read,write);
	
}
public static void copy (File read,File write) {
	if(!write.exists()) {
		write.mkdirs();
	}
	File[] list=read.listFiles();
	for(File temp:list) {
		String name =temp.getName(); 
		if(temp.isDirectory()) {
			File son=new File(write.getAbsolutePath()+"/"+name);
			copy(temp,son);
			System.out.println("2222");
		}
		
		try {
			new FileUtil().fileCopy(temp.getAbsolutePath(), write.getAbsolutePath()+"/"+name);
			System.out.println("111");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
