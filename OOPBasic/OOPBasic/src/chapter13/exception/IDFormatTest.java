package chapter13.exception;

public class IDFormatTest {
	
	private String userId;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) throws IDFormatException {
		if (userId == null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		} else if (userId.length() < 8 || userId.length() > 20) {
			throw new IDFormatException("���̵�� 8�ڿ��� 20�� �����Դϴ�.");
		}
		this.userId = userId;
		
	}


	public static void main(String[] args) {
		IDFormatTest idTest = new IDFormatTest();
		String myId = "hello";
		try {
			idTest.setUserId(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
	}
}
