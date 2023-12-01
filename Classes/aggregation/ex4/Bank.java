package aggregation.ex4;

import java.util.Arrays;
import java.util.Comparator;

public class Bank {
	private Client[] clients;
	private Bill[] bills;
	
	public Bank() {
		super();
		this.clients = initClient();
		this.bills = initBill();
	}

	public Bill[] initBill() {
		Bill bill_1 = new Bill("1234 5332 8795 2254", -53, false, 10324);
		Bill bill_2 = new Bill("4525 3252 5763 4533", 122, true, 10324);
		Bill bill_4 = new Bill("6574 5325 5485 3450", 620, true, 10324);
		Bill bill_3 = new Bill("2893 2379 2389 2834", 145, true, 13123);
		Bill bill_5 = new Bill("0213 0783 3930 3846", -78, false, 13123);
		Bill bill_6 = new Bill("9283 3248 2343 9894", 93, true, 53632);
		Bill bill_7 = new Bill("3493 3242 3242 3432", 1000, true, 53632);
		Bill bill_8 = new Bill("4983 3423 2343 2444", -103, false, 53632);
		Bill bill_9 = new Bill("3444 4524 4353 3563", 589, true, 13123);
		Bill bill_10 = new Bill("1344 4552 2542 0489", 491, true, 53632);
		
		return new Bill[]{bill_1, bill_2, bill_3, bill_4, bill_5,
					bill_6, bill_7, bill_8, bill_9, bill_10};
	}
	
	public Client[] initClient() {
		Client client_1 = new Client("Leon", 10324);
		Client client_2 = new Client("Sasha", 13123);
		Client client_3 = new Client("Vlad", 53632);
		
		return new Client[] {client_1, client_2, client_3};
	}

	public Client[] getClients() {
		return clients;
	}

	public Bill[] getBills() {
		return bills;
	}
	
	public void blocked(String numberBill) {
		for (Bill bill : bills) {
			if(bill.getNumberOfBill().equalsIgnoreCase(numberBill)) {
				bill.setStatus(false);
				System.out.println("Bloked #" + bill.getNumberOfBill());
			}
		}
	}
	
	public void unblocked(String numberBill) {
		for (Bill bill : bills) {
			if(bill.getNumberOfBill().equalsIgnoreCase(numberBill)) {
				bill.setStatus(true);
				System.out.println("UnBloked #" + bill.getNumberOfBill());
			}
		}
	}
	
	public void search(int passportNumber) {	
		boolean found = false;
		for (Client client : clients) {
			if(client.getPassportNumber() == passportNumber) {
				found = true;
				System.out.println("Client -> "+client.getName());
				for (Bill bill : bills) {
					if(bill.getPassportNumber() == passportNumber) {
						System.out.println(bill);
					}
				}
			}
		}
		if(!found) {
			System.out.println("Wrong number passport -> " + passportNumber);
		}
		
	}
	
	public void sort() {
		Arrays.sort(bills, new Comparator<Bill>() {

			@Override
			public int compare(Bill o1, Bill o2) {
				int num = o1.getPassportNumber() - o2.getPassportNumber();
				return num == 0? o1.getMoney() - o2.getMoney() : num;
			}
			
		});
	}
	
	public int totalSum() {
		int resultSum = 0;
		for (Bill bill : bills) {
			resultSum += bill.getMoney();		
		}						
		return resultSum;		
	}
	
	public int totalPosSum() {
		int resultSum = 0;
		for (Bill bill : bills) {
			if(bill.getMoney() > 0) {
				resultSum += bill.getMoney();
			}		
		}
		return resultSum;
	}
	
	public int totalNegSum() {
		int resultSum = 0;
		for (Bill bill : bills) {
			if(bill.getMoney() < 0) {
				resultSum += bill.getMoney();
			}		
		}
		return resultSum;
	}

	@Override
	public String toString() {
		int i = 0;
		StringBuilder builder = new StringBuilder();
		for (Client client : clients) {
			builder.append(client);
		}
		for (Bill bill : bills) {
			builder.append(i+++"_").append(bill).append("\n");
		}
			
		return builder.toString();
		
	}

}
