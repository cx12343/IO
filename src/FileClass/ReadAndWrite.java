package FileClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAndWrite {
	public static void main(String[] args) {
		//������ϵ
		File path =new File("d:/a.txt");
		FileInputStream a=null;//����������
		//ѡ����
		try {
			a =new FileInputStream(path);
			byte [] car = new byte [10];
			int len =0;//����ʵ�ʴ�С
			/*a.read(car);
			String str0= new String (car,0,car.length);
			System.out.println(str0);*/
			while (-1!=(len=a.read(car))) {
				//�ֽ�ת��Ϊ�ַ���
				String str= new String (car,0,len);
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�������");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		}finally {
			try {//�ͷ���Դ 
				if(null==a) {
				a.close();
				}
			} catch (IOException e) {
				//
				System.out.println("�ر���Դʧ��");
				e.printStackTrace();
			}
		
		}
		
	}
}
