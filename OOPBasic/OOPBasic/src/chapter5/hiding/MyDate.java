package chapter5.hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	public MyDate(int day, int month, int year) {
		if(day<=31 && day>=1) {
			this.day = day;
		} else {
			isValid = false;
		}
		if(month >=1 && month <= 12) {
			this.month = month;
		} else {
			isValid = false;
		}
		if (year >= 1900 && year <= 2020) {
			this.year = year;
		} else {
			isValid = false;
		}
	}
	
	public void showDate(){
		if(!isValid) {
			System.out.println("잘못된 값을 입력하셨습니다.");			
		} else {
			System.out.println("제 생일은 " + year + "년 " + month + "월 " + day + "일 입니다.");			
		}
	}
}
