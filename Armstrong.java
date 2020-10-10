// narcissistic number
// sum of power of digits = number 
// digits when raised to the power of 3 is a digit itself
import java.util.*;
public class Armstrong {
	public static int isArmstrong(int num) {
		int digit=0,length=0,sum =0;
		int num_copy = num;
		while(num_copy > 0)
		{
			num_copy = num_copy / 10;
			length++;
		}
		num_copy = num;
		while(num_copy > 0) {
			digit = num_copy % 10;
			num_copy = num_copy / 10;
			sum += Math.pow(digit, length);
		}
		if (sum == num)
			return 1;
		else
			return 0;
	}
	public static void main(String [] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number >> ");
		num = sc.nextInt();
		if (isArmstrong(num) == 1)
			System.out.println(num+ " is armstrong ");
		else
			System.out.println(num + " is not a armstrong");
	}
}
