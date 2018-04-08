package FileClassDisposeStream;
/**
 * 编码与解码不统一 会乱码
 */
import java.io.UnsupportedEncodingException;

public class ConverStream {
public static void main(String[] args) throws UnsupportedEncodingException {
	String str="中国";
	byte [] data=str.getBytes();
	System.out.println(new String(data));
	
	//编码不统一
	data =str.getBytes("utf-8");
	System.out.println(new String(data));
	//长度丢失 字节缺少
	data =str.getBytes();
	System.out.println(new String(data,0,3));
}
}
