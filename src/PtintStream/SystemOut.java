package PtintStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SystemOut {
public static void main(String[] args) throws FileNotFoundException {
		System.out.println("fsd");
		//�ض���
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("D:/z.txt")),true));
		System.out.println("dsdes");
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("zz");
}

public static void test01() throws FileNotFoundException {
	InputStream is= System.in;//��������
	is =new BufferedInputStream(new FileInputStream("D:/z.txt"));
	Scanner sc =new Scanner(is);
	System.out.println("������");
	System.out.println(sc.nextLine());
}
}
 