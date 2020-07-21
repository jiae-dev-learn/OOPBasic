package chapter14.stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {
	
	public static void main(String[] args) {
		System.out.println("ÀÔ·Â: ");
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '³¡') {
				System.out.println((char)i);				
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
