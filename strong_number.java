// sum of factorial of digits is equal to the number itself 
import java.util.*;
public class strong_number {
	public static void main(String [] args) {
		int n,i,fact,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number >> ");
		n = sc.nextInt();
		int sum = 0;
		int temp = n;
		while(n != 0)
		{
			i = 1;
			fact = 1;
			rem = n % 10;
			while(i <= rem) {
				fact = fact * i;
				i++;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if ( sum == temp)
			System.out.println(temp + " is strong number ");
		else
			System.out.println("Not a strong number");
		
	}
}
