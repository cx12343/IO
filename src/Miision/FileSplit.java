package Miision;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileSplit {
	private File file;
	private List<String> out;
	private File outpote;
	private int begin;
	private int end;
	private byte[] size;
	public FileSplit() {
		size =new byte[50];
		out =new ArrayList<String>();
	}
	public FileSplit(File file,File outpote, int size) {
		out =new ArrayList<String>();
		this.file = file;
		this.size = new byte [size];
		this.outpote=outpote;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public byte[] getSize() {
		return size;
	}
	public void setSize(byte[] size) {
		this.size = size;
	}
	
	public void readFile() throws IOException {
		RandomAccessFile is=new RandomAccessFile(file,"r");
		int i=0;
		is.seek(begin);
		while(-1!=(is.read(size, 0, size.length))) {
			String a =outpote.getPath()+"\\"+file.getName()+".part"+i;
			System.out.println(a);
			out.add(a);
			File temp=new File(out.get(i));
			
			if(begin+size.length<file.length()) {
			spliter(temp,begin,size.length,size);
			
			}else {
				spliter(temp,begin,(int)file.length()-begin,size);
			}
			i++;
			begin=begin+size.length;
			
		}
		is.close();
	}
	public void spliter(File outpote,int begin,int end,byte[] size) throws IOException {
		
		BufferedOutputStream raf =new BufferedOutputStream(new FileOutputStream(outpote));
		
		raf.write(size,0,end);
		
		raf.close();
		
	}
	public static void main(String[] args) throws IOException {
		File a= new File("D:/a.txt");
		File b= new File("D:/1");
		FileSplit c=new FileSplit(a,b,30);
		c.readFile();
	}
}
