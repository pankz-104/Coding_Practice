import java.util.Scanner;
public class prime_in_range {
	public static boolean checkprime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i< n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		int low, high;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of values : ");
		low = sc.nextInt();
		high = sc.nextInt();
		for (int i = low; i<=high; i++) {
			if(checkprime(i) == true)
				System.out.println(Integer.toString(i)+" Prime number");
		}
	}
}
