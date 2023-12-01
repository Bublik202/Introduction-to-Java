package aggregation.ex4;


public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.blocked("6574 5325 5485 3450");
		bank.unblocked("6574 5325 5485 3450");
		bank.search(10324);
		
		//Sorting money
		bank.sort();
		System.out.println(bank);
		
		int totalSum = bank.totalSum();
		System.out.println("The total sum -> " + totalSum + "$");
		
		int totalPositiveSum = bank.totalPosSum();
		System.out.println("The total positive sum -> " + totalPositiveSum + "$");
		
		int totalNegativeSum = bank.totalNegSum();
		System.out.println("The total negative sum -> " + totalNegativeSum + "$");
	}

}
