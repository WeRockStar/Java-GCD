import java.util.Scanner;

public class solve {
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}

	public static void main(String[] args) {
		System.out.println("GCD = " + gcd(45, 21));
		
	}

}
