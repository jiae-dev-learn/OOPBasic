package chapter10.date;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public int hashCode() {
		return year * 10000 + month * 100 + day;
	}

	@Override
	public boolean equals(Object obj){
		MyDate date = (MyDate)obj;
		return (date.getYear()==this.year) && (date.getMonth()==this.month) && (date.getDay()==this.day)? true: false;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}	
	
}
		
public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(10, 12, 2020);
		MyDate date2 = new MyDate(10, 12, 2020);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}
}
