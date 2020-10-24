import java.util.Scanner;
public class reverse_number {
	public static void main(String [] args) {
		int rem = 0, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :: ");
		int n = sc.nextInt();
		while(n!=0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println("Rev no : "+rev);
	}
}
