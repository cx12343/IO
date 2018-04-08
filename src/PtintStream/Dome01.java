package PtintStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Dome01 {
public static void main(String[] args) throws FileNotFoundException {
	
	System.out.println("test");
	PrintStream ps=System.out;
	ps.println("fdf");
	ps =new PrintStream(new BufferedOutputStream(new FileOutputStream("D:/z.txt")));
	ps.print("sfsda");
	ps.flush();
	ps.close();
}
}
