package FileClassDisposeStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeInOne {
	public static void main(String[] args) throws IOException {
		File read =new File("D:/a.txt");
		BufferedReader r =new BufferedReader(
				new InputStreamReader(
						new FileInputStream(read), "utf-8"));
		String info =null;
		while(null!=( info=r.readLine())) {
			System.out.println(info);
		
		}
		r.close();
	}
}
