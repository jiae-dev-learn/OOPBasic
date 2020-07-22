package chapter14.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		
		try (FileInputStream fis =  new FileInputStream("files/input.txt")) {
			int i; //�ѹ���Ʈ�� �б� ������ �ѱ��� FileinputStream���δ� ���� ����.
			while((i = fis.read()) != -1) {
				System.out.println((char)i);	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
