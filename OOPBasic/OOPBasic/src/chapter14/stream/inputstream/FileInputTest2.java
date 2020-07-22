package chapter14.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		
		try (FileInputStream fis =  new FileInputStream("files/input2.txt")) {
			int num;
			byte[] bs = new byte[10];
			while((num = fis.read(bs)) != -1) {
//				for(byte b: bs) {
//					System.out.print((char)b);	
//				}
				for(int k = 0; k<num; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
