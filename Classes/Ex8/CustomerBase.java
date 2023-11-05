package Ex8;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerBase{
	Customer[] customers;	
	
	public CustomerBase(int size) {
		super();
		this.customers = new Customer[size];
	}
	
	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}	
	
	public void add(Customer customer, int index) {
		if(index >= 0 && index < customers.length) {
			customers[index] = customer;
		}		
	}
	
	public Customer[] sortCustomer() {
		Customer[] array = Arrays.copyOf(customers, customers.length);
		
		Arrays.sort(array, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {			
				int num = o1.getSurname().compareTo(o2.getSurname());								
				return num == 0 ?  o1.getName().compareTo(o2.getName()) : num ;
			}
		});	
		return array;
	}
	
	public Customer[] sortCard(int t1, int t2) {
		Customer[] array = new Customer[customers.length];
		int i = 0;
		for (Customer customer : customers) {
			if(customer.getCreditCard() > t1 && customer.getCreditCard() < t2) {
				array[i++] = customer;
			}
		}			
		return Arrays.copyOf(array, i);
	}

	@Override
	public String toString() {
		System.out.println("CustomerBase: ");
		for (Customer customer : customers) {
			System.out.println(customer);
		}	
		return "";
	}

}
