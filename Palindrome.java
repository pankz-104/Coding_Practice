
public class Palindrome {
	public static void main(String [] args) {
		int num = 1232221;
		int reverse = 0, digit;
		int num_copy = num;
		
		while(num_copy > 0) {
			digit = num_copy % 10;
			num_copy = num_copy / 10;
			reverse = reverse * 10 + digit;
		}
		if (reverse == num) 
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
}
