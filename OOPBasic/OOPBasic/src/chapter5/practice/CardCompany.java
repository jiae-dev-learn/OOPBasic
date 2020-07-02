package chapter5.practice;

public class CardCompany {
	private static int cardId = 10000;
	private static CardCompany instance = new CardCompany();
	private CardCompany() {
		
	}
	public static CardCompany getInstance() {
		return instance;
	}
	
	public static Card createCard() {
		Card card = new Card(cardId);
		cardId++;
		return card;
	}
}
