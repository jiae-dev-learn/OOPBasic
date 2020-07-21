package chapter13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseableTest {
	public static void main(String[] args) {
		//java9부터는 obj를 위에 선언해도 괜찮지만 java8까지는 obj 생성도 try 안에 써야한다.
		try (AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		try (FileInputStream fis = new FileInputStream("a.txt")){
			
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
