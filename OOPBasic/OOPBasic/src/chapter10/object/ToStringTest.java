package chapter10.object;

class Book implements Cloneable{
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// 이 객체가 힙 메모리에서 해제될 때, 가비지콜랙터에서 수행하는 코드
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	
}

public class ToStringTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Book book = new Book("토지", "박령리");
		System.out.println(book);

		String str = new String("토지");
		System.out.println(str);

		Book book2 = (Book) book.clone();
		System.out.println(book2);
	}
}
