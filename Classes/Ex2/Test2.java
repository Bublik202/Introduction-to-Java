package Ex2;

public class Test2 {
	private int a;
	private int b;
	
	//конструктор с входными параметрами
	public Test2(int a, int b, String [] str) {
		super();
		this.a = a;
		this.b = b;
		str = new String []{"world", "black"};
	}

	public Test2() {
		super();
	}

	// set и get методы для полей экземпляра класса	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}
