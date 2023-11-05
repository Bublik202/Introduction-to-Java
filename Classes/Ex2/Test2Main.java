package Ex2;

public class Test2Main {

	public static void main(String[] args) {
		Test2 test = new Test2();
		test.setB(4);
		
		Test2 test1 = new Test2(2, 5, new String[] {});
		System.out.println("Konstructor 1: "+test1.getA());
		

	}

}
