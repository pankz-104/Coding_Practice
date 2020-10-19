// Example series -- 0,0,7,6,14,12,21,18,28.. ..
// Find the 15th term of the series 
public class nth_term_of_series {
	public static void main(String [] args) {
		int a = 7,b = 0, c;
		System.out.println("Series : ");
		for (int i = 1 ; i < 8 ;i++) {
			c = a*b;
			System.out.println(c+ "  "+(c-b)+"  ");
			b++;
		}
		c = a * b;
		System.out.println(c);
		System.out.println("15th element of series is :: "+c);
	}
}
