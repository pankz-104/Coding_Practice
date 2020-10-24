import java.util.Scanner;
public class reverse_string {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
				
		// appending the characters in revere order 
		for(int i=str.length()-1 ; i>=0 ; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
	}
}
