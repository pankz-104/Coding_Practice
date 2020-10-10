import java.util.Scanner;
public class Factorail_recursion {
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		else
			return (n * factorial(n-1));
	}
	public static void main(String args[]) {
		int i,fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number >> ");
		int num = sc.nextInt();
		fact = factorial(num);
		System.out.println("Factorial is "+fact);
	}
}
