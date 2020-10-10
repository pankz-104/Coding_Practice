import java.util.Scanner;

public class factorial_for_loop {
	public static void main(String [] args) {
		int i, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number >> ");
		int num = sc.nextInt();
		for(i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of : "+num+" is : "+fact);
	}
}
