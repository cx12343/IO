package FileClass;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public class Mkdir {
public static void main(String[] args) {
	String path ="D:/KwDownload/";
	
	File str = new File (path);
	//str.mkdir(); //创建文件夹
	//确保父路径存在 否则不能创建
	//str.delete();//删除
	//父目录不存在 就创建出来
	//str.mkdirs();
/*	if (str.isDirectory()) {
		 String [] list =str.list();//字符数组
		for (String temp:list) {
			File zz= new File (str.getPath()+temp);
			if (zz.isFile()) {
				System.out.println(temp+"文件");
			}else {
				System.out.println(temp+"文件夹");
			}
		}
	}*/
	File [] list02= str.listFiles();//文件数组
	File [] list03 =str.listFiles(new FilenameFilter() {

		@Override
		public boolean accept(File arg0, String arg1) {
			
			return arg1.endsWith(".txt");
		}
		
	});
	for(File temp:list03) {
		System.out.println(temp.getPath());
	}

	System.out.println("================显示D盘下所有文件=======================");
	File s = new File(path);
	File []list =s.listFiles();
	//show(list);
	File [] root = File .listRoots();//显示根目录
	show(root);
	
}
//===============显示D盘下所有文件===========
public static void show(File [] list) {
	
	for(File temp:list) {
		if(null==temp || !temp.exists() ) {
			return ;//终止循环
		}
		System.out.println(temp);
		if(temp.isDirectory()) {
			show(temp.listFiles());	 
		}
	}
}
}
