package FileClassDisposeStream;
/**
 * ��������벻ͳһ ������
 */
import java.io.UnsupportedEncodingException;

public class ConverStream {
public static void main(String[] args) throws UnsupportedEncodingException {
	String str="�й�";
	byte [] data=str.getBytes();
	System.out.println(new String(data));
	
	//���벻ͳһ
	data =str.getBytes("utf-8");
	System.out.println(new String(data));
	//���ȶ�ʧ �ֽ�ȱ��
	data =str.getBytes();
	System.out.println(new String(data,0,3));
}
}
