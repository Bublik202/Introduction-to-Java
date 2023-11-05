package Ex8;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {	
		CustomerBase base = new CustomerBase(5);		
		base.add(new Customer(14, 583423, 1, "Michalchuk", "Leon", "Aleksandrovich", "Home_1"), 0);
		base.add(new Customer(22, 124146, 2, "Golubev", "Nikita", "Viktorovich", "Home_2"), 1);
		base.add(new Customer(16, 567452, 3, "Michalchuk", "Sasha", "Aleksandrovich", "Home_3"), 2);
		base.add(new Customer(42, 196543, 4, "Kuksar", "Artem", "Segevich", "Home_4"), 3);
		base.add(new Customer(29, 214772, 5, "Michalchuk", "Vlad", "Aleksandrovich", "Home_5"), 4);		
		System.out.println(base);
		
		Customer[] array = base.sortCustomer();
		System.out.println("Sorting surname and name: ");
		for (Customer customer : array) {
			System.out.println(customer);
		}
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("\ninput first diapazone: ");
			int t1 = scan.nextInt();
			System.out.print("input second diapazone: ");
			int t2 = scan.nextInt();
			
			Customer[] arrayCard = base.sortCard(t1, t2);
			System.out.println("\nCustomer with " + t1 + " and " + t2 + ": ");
			for (Customer customer : arrayCard) {
				System.out.println(customer);
			}
		}
	}

}
