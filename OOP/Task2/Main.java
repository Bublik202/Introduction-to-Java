package Task2;

public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.addItem(Food.SUSHI, 2);
		payment.addItem(Food.CREAMED_SPINACH, 1);
		payment.addItem(Food.HAMBURGER, 4);
		
		System.out.print(payment);
		payment.sumGoods();
		
	}

}
