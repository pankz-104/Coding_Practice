// checking if two arrays are same or not 
import java.util.Scanner;
public class same_arrays {
	static void sort(int arr[], int n) {
		int i,j;
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static int array_equal(int arr1[], int arr2[],int s1, int s2) {
		sort(arr1, s1);
		sort(arr2, s2);
		int i, count = 0;
		for(i=0;i<s1;i++) {
			if(arr1[i] == arr2[i]) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of both arrays : ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int arr1[] = new int[s1];
		int arr2[] = new int[s2];
		
		System.out.println("Enter elements of arrays : ");
		for(int i=0;i<s1;i++)
			arr1[i] = sc.nextInt();
		for(int i=0;i<s2;i++)
			arr2[i] = sc.nextInt();
		
		if(array_equal(arr1, arr2, s1, s2) != s1) {
			System.out.println("Not same");
		}
		else
			System.out.println("Same");
	}
}
