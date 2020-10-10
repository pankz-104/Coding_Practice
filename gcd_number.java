
public class gcd_number {
	public static void main(String [] args) {
		int n1 = 300, n2 = 50;
		int hcf = hcf(n1, n2);
		System.out.println("GCD is : "+hcf);
	}
	public static int hcf(int n1, int n2) {
		if (n2 != 0) 
			return hcf(n2, n1%n2);
		else
			return n1;
	}
}
