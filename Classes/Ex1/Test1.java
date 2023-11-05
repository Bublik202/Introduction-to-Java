package Ex1;

public class Test1 {
	private int a;
	private int b;
	
	//методы изменения этих переменных
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
	
	//метод вывода
	@Override
	public String toString() {
		return "Result: a = " + a + ", b = " + b + "";
	}
	
	//метод суммы
	public int sum() {
		int sum = this.a + this.b;
		return sum;
	}
	
	//Метод максимального значения
	public int max() {
		int max = 0;
		if(this.a > this.b) {
			max = this.a;
		}else {
			max = this.b;
		}
		return max;
	}

}
