import java.util.Scanner;
public class reverse_recursive {
	static int rev_num = 0;
	static int base_pos = 1;
	static int reverse_recursive(int num) {
		if(num > 0) {
			reverse_recursive(num / 10);
			rev_num += (num % 10) * base_pos;
			base_pos *= 10;
		}
		return rev_num;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(reverse_recursive(n));
	}
}
