package FileClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAndWrite {
	public static void main(String[] args) {
		//建立联系
		File path =new File("d:/a.txt");
		FileInputStream a=null;//提升作用域
		//选择流
		try {
			a =new FileInputStream(path);
			byte [] car = new byte [10];
			int len =0;//接受实际大小
			/*a.read(car);
			String str0= new String (car,0,car.length);
			System.out.println(str0);*/
			while (-1!=(len=a.read(car))) {
				//字节转换为字符串
				String str= new String (car,0,len);
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally {
			try {//释放资源 
				if(null==a) {
				a.close();
				}
			} catch (IOException e) {
				//
				System.out.println("关闭资源失败");
				e.printStackTrace();
			}
		
		}
		
	}
}
