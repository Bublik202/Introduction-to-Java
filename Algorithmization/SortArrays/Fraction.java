package SortArrays;

public class Fraction {
	
	int p; //числитель
	int q; //знаменатель
	
	Fraction(int p, int q){
		this.p = p;
		this.q = q;
	}
	
	public boolean equals(Object obj)
	 {
	  if (obj==null)
	   return false;

	  if (obj.getClass() != this.getClass() )
	   return false;

	  Fraction other = (Fraction) obj;
	  return this.p* other.q == this.q * other.p;
	 }	
	
	 // Get max of the two fractions
	static Fraction maxFraction(Fraction first, Fraction sec)
	{
	    // Declare nume1 and nume2 for get the value of
	    // first numerator and second numerator
	    int a = first.p;
	    int b = first.q;
	    int c = sec.p;
	    int d = sec.q;
	  
	    /*
	     *  Compute ad-bc 
	     *  Чтобы сравнить две дроби, нам нужно сделать их знаменатели одинаковыми. 
	     *  Мы можем сделать это, умножив числители на знаменатели.
	     */
	    int y = a * d - b * c; 
	    /*
	     * Y = (a / b - c / d)  = (ad - bc) / (bd)
	     * Теперь, если Y> 0, то a / b > c / d 
	     * если Y = 0, то a / b = c / d
	     * если Y < 0, то a / b < c / d 
	     * Поскольку bd всегда положительно, знак Y зависит только от числитель (ad-bc). Итак, нам нужно только вычислить (ad-bc).
	     */	     
	  
	    return (y > 0) ? first : sec;
	}
	
	
	static int lcm(int p, int q, int gcdValue)
	/**
	 * НОК - P и Q - это наименьшее число, которое можно разделить как на P, так и на Q, оставляя остаток 0 в каждом случае.
	 * НОК двух чисел можно вычислить в подходе Евклида, используя НОД для A и B	 * 
	 * @gcdValue - НОД
	 * @abs - модуль числа	 * 
	 * @return lcm() method returns the LCM of p and q
	 */
	{
		return Math.abs(p * q) / gcdValue;
	}
	
	static int gcd(int p, int q) {
		/**
		 * Евклидов алгоритм вычисления НОД: НОД двух чисел P и Q остается неизменным, 
		 * даже если большее число заменяется модулем P и Q.		 * 
		 * выполняем операцию НОД для P и Q несколько раз, заменяя P на Q и Q по модулю P и Q, 
		 * пока модуль не станет 0.
		 * 
		 * @return gcd method returns the GCD of p and q
		 */
		
		if (q == 0 ) //if q=0, a is the GCD
			return p;
		else
			return gcd(q, p % q); 
			/*
			 * call the gcd() method recursively by, replacing p with q and q with modulus(p,q) as long as q != 0
			 */
	}
	
	static int [] addMult(int q1, int q2, int lcmValue) {
		/**
		 * additional multiplier (дополнительный множитель)
		 */		
		
		return new int[] {lcmValue/q1, lcmValue/q2};
	}
	
	static int [] multiply(int p, int q, int gcdValue) {
		/**
		 * умножаем числитель и знаменатель дроби на общий множитель 
		 */		
		
		return new int [] {p*gcdValue, q*gcdValue};
	}

}
