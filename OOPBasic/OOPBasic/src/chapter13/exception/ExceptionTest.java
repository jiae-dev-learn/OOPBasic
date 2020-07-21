package chapter13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
			System.out.println("������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				if (fis!=null) {
					fis.close();
					System.out.println("finally");
				}
			} catch (IOException e) {
				System.out.println(e.toString());
				System.out.println("������ �ݴµ� �����Ͽ����ϴ�.");				
			}
		}
		System.out.println("end");
	}
}
