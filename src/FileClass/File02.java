package FileClass;

import java.io.File;
import java.io.IOException;

public class File02 {
public static void main(String[] args) throws IOException {
	test03();
}
public static void test03() throws IOException {
	File src=new File("D:/a.txt");
	System.out.println(src.length());
	
	//创建文件 删除文件
	File src1=new File("D:/b");
	if(!src1.exists()) {
		boolean flag= src1.createNewFile();
		System.out.println(flag);	
	}
	boolean flag= src1.delete();
	System.out.println(flag);
}

//读取文件信息
public static void test02() {
	File src=new File("D:/zz.txt");
	System.out.println(src.exists());//文件是否存在
	System.out.println(src.canRead());
	System.out.println(src.isFile());
	if (src.isFile()) {
		System.out.println("文件");
	}else {
		System.out.println("文件夹");//如果文件不存在 判断是文件夹 
	}
}
public static void test01() {
	File src=new File("a.text");
	System.out.println(src.getName());//返回名字
	System.out.println(src.getAbsolutePath());//返回绝对路径
	System.out.println(src.getParent());//返回父目录  相对路径如果在根目录返回空
	System.out.println(src.getPath());//返回相对路径
}

}
