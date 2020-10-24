// 1. The program will recieve 3 English words inputs from STDIN
//
// These three words will be read one at a time, in three separate line
// The first word should be changed like all vowels should be replaced by %
// The second word should be changed like all consonants should be replaced by #
// The third word should be changed like all char should be converted to upper case
// Then concatenate the three words and print them


import java.util.Scanner;
public class changing_string_element {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		String str1 = "";
		String str2 = "";
		String str3 = "";
		char c;
		
		// for 1st word 
		for(int i=0;i<=l1-1;i++) {
			c = s1.charAt(i);
			if ( c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u' ) {
				str1 = str1 + "%";
			}		
			else 
				str1 = str1 + c;
		}
		
		// for 2nd word
		for(int i=0;i<=l2-1;i++) {
			c = s2.charAt(i);
			if ( c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u' ) {
				str2 = str2 + c;
			}
			else
				str2 = str2 + "#";
		}
		str3 = s3.toUpperCase();
		System.out.println("Words are :: "+ str1 + "  " + str2 +"  "+str3);
	}
}
