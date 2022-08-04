import java.util.*;

public class Linear {
	public int search(int arr[],int searchele) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == searchele) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {32,54,12,4,26};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter search element:");
		int searchele = sc.nextInt();
		Linear l = new Linear();
		int result = l.search(arr, searchele);
		if(result==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index " + result);
		}
	}

}
