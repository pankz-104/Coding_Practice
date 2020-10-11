// sum of last two numbers 
// 0 1 2 3 5 8 13 21 ......
import java.util.Scanner;
public class Fibonacci {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i,first=0, second=1, third;
		for(i=1; i<=number; i++) {
			System.out.println(first);
			third = first + second;
			first = second;
			second = third;
		}
	}
}
