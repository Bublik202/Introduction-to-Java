package aggregation.ex5;

public class Main {

	public static void main(String[] args) {
		Tourist tourist = new Tourist();
		tourist.init();
		tourist.sort();
		
//		Сортированные путевки по дням
//		System.out.println("Sorting vouchers: "+tourist);

//		Все путевки в определенную страну 
		tourist.selectCounty("Ukraine");
		
		System.out.println("-----------------------------------------------\n");
		
//	    Все путевки на определенном виде транспорта
		tourist.selectTransport("Plane");
		
		System.out.println("-----------------------------------------------\n");
		
//		Путевки от и до кол-во дней
		tourist.selectCountDays(20, 35);
		
		System.out.println("-----------------------------------------------\n");
		
//		Путевки в определенный город 
		tourist.selectCity("New York");
		
	}

}
