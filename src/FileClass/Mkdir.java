package FileClass;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public class Mkdir {
public static void main(String[] args) {
	String path ="D:/KwDownload/";
	
	File str = new File (path);
	//str.mkdir(); //�����ļ���
	//ȷ����·������ �����ܴ���
	//str.delete();//ɾ��
	//��Ŀ¼������ �ʹ�������
	//str.mkdirs();
/*	if (str.isDirectory()) {
		 String [] list =str.list();//�ַ�����
		for (String temp:list) {
			File zz= new File (str.getPath()+temp);
			if (zz.isFile()) {
				System.out.println(temp+"�ļ�");
			}else {
				System.out.println(temp+"�ļ���");
			}
		}
	}*/
	File [] list02= str.listFiles();//�ļ�����
	File [] list03 =str.listFiles(new FilenameFilter() {

		@Override
		public boolean accept(File arg0, String arg1) {
			
			return arg1.endsWith(".txt");
		}
		
	});
	for(File temp:list03) {
		System.out.println(temp.getPath());
	}

	System.out.println("================��ʾD���������ļ�=======================");
	File s = new File(path);
	File []list =s.listFiles();
	//show(list);
	File [] root = File .listRoots();//��ʾ��Ŀ¼
	show(root);
	
}
//===============��ʾD���������ļ�===========
public static void show(File [] list) {
	
	for(File temp:list) {
		if(null==temp || !temp.exists() ) {
			return ;//��ֹѭ��
		}
		System.out.println(temp);
		if(temp.isDirectory()) {
			show(temp.listFiles());	 
		}
	}
}
}
