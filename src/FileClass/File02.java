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
	
	//�����ļ� ɾ���ļ�
	File src1=new File("D:/b");
	if(!src1.exists()) {
		boolean flag= src1.createNewFile();
		System.out.println(flag);	
	}
	boolean flag= src1.delete();
	System.out.println(flag);
}

//��ȡ�ļ���Ϣ
public static void test02() {
	File src=new File("D:/zz.txt");
	System.out.println(src.exists());//�ļ��Ƿ����
	System.out.println(src.canRead());
	System.out.println(src.isFile());
	if (src.isFile()) {
		System.out.println("�ļ�");
	}else {
		System.out.println("�ļ���");//����ļ������� �ж����ļ��� 
	}
}
public static void test01() {
	File src=new File("a.text");
	System.out.println(src.getName());//��������
	System.out.println(src.getAbsolutePath());//���ؾ���·��
	System.out.println(src.getParent());//���ظ�Ŀ¼  ���·������ڸ�Ŀ¼���ؿ�
	System.out.println(src.getPath());//�������·��
}

}
