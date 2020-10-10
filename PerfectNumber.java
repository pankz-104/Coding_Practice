// number whose sum of divisors is equal to the number itself 
// ex : 6, 496
public class PerfectNumber {
	public static void main(String [] args) {
		int sum = 0;
		int n = 6;
		for(int i = 1; i<n ; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		if (sum == n)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a perfect number");
	}
}
