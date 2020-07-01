package chapter5.hiding;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date = new MyDate(13, 4, 1994);
		date.showDate();
		
		MyDate wdate = new MyDate(100, 5, 1994);
		wdate.showDate();
		
	}
}
