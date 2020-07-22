package chapter14.stream.coffee;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee americano = new KenyaAmericano();
		americano.brewing();
		
		System.out.println();
		
		Coffee kenyaLatte = new Latte(new KenyaAmericano());
		kenyaLatte.brewing();
		
		System.out.println();
		
		Coffee kenyMocha = new Mocha(new KenyaAmericano());
		kenyMocha.brewing();
		
		System.out.println();
		
		Coffee etiMocha = new Mocha(new EtiopicaAmericano());
		etiMocha.brewing();
	}
}
