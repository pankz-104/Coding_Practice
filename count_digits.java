import java.util.Scanner;
public class count_digits {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number > ");
		int digit = sc.nextInt();
		int count = 0;
		while(digit != 0) {
			int last_digit = digit % 10;
			count++;
			digit = digit / 10;
		}
		System.out.println("total digit count is : "+count);
	}
}
