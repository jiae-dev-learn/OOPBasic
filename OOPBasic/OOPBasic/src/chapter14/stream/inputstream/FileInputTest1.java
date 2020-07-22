package chapter14.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		
		try (FileInputStream fis =  new FileInputStream("files/input.txt")) {
			int i; //한바이트씩 읽기 때문에 한글은 FileinputStream으로는 읽지 못함.
			while((i = fis.read()) != -1) {
				System.out.println((char)i);	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
