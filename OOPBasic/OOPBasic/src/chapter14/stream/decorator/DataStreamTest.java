package chapter14.stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("files/data.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("files/data.txt");
				DataInputStream dis = new DataInputStream(fis)) {
			
			dos.writeByte(100);
			dos.write(100);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���?");
			
			// �� ��İ� �����ϰ� �о�� ��. 
			System.out.println(dis.readByte());
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
