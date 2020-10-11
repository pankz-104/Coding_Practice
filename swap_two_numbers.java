import java.util.Scanner;
public class swap_two_numbers {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter two numbers >> ");
		a = sc.nextInt();
		b = sc.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("numbers are : "+a+" "+b);
	}
}
