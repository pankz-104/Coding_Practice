import java.util.Scanner;
public class remove_duplicate {
	public static int remove_duplicate_elements(int arr[], int n) {
		if(n == 0 || n == 1) 
			return n;
		
		int temp[] = new int[n];
		int i,j=0;
		for(i=0;i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		
		// changing original array
		for(i=0;i<j;i++) {
			arr[i] = temp[i];
		}
	return j;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		System.out.println("Enter elements of array");
		int arr[] = new int[n+1];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int length = arr.length;
		length = remove_duplicate_elements(arr,n);
		System.out.println("Array after removing: ");
		for(int i=0;i<length;i++)
			System.out.println(arr[i] + " ");
	}
}
