public class GCD {
	public static void main(String[] args) {
		int a = 45, b = 21;
		int t;
		while (b > 0) {
			t = a % b;
			a = b;
			b = t;
		}

		System.out.println("GCD : " + a);

		/*
		 * 
		 * gcd(45 , 21) = gcd(21 , 45 % 21)
		 * 				= gcd(21 , 3)
		 * 				= gcd(3 , 0)
		 * 				= 3
		 */
	}
}
