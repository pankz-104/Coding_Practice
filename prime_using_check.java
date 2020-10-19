// finding prime number using function check
import java.util.*;
public class prime_using_check {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :: ");
		int n = sc.nextInt();
		// creating object of main class 
		prime_using_check ob = new prime_using_check();
		
		// calling function with value n, as parameter 
		ob.check(n);
	}
	void check(int n) {
		if (n < 0)
			System.out.println("Please enter positive integer :: ");
		else
			prime(n);
	}
	
	// function for checking prime or not 
	void prime(int n) {
		int rem=0;
		for(int i = 2;i < n; i++) {
			if(n%i == 0)
				rem++;
		}
		if(rem >= 1)
			System.out.println("Entered number is not a prime");
		else {
			System.out.println("It's a prime number");
		}
		
	}
}
