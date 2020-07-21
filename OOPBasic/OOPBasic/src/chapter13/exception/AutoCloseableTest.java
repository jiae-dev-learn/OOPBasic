package chapter13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseableTest {
	public static void main(String[] args) {
		//java9���ʹ� obj�� ���� �����ص� �������� java8������ obj ������ try �ȿ� ����Ѵ�.
		try (AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		try (FileInputStream fis = new FileInputStream("a.txt")){
			
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
