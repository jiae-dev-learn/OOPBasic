package chapter5.practice;

public class CardCompanyTest {
	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = CardCompany.createCard();
		Card yourCard = CardCompany.createCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
	}
}
