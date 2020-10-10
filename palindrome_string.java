import java.util.Scanner;
public class palindrome_string {
	public static void main(String [] args) {
		String rev = "", pal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string > ");
		pal = sc.nextLine();
		int length = pal.length();
		for (int i = length - 1 ; i >=0 ; i--)
			rev = rev + pal.charAt(i);
		if(pal.equals(rev))
			System.out.println(pal + " is palindrome ");
		else
			System.out.println("Not a palindrome");
			
	}
}
