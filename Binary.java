import java.util.Arrays;
import java.util.Scanner;

public class Binary {
	
	public int search(int arr[],int searchele,int low,int high) {
		
		while (low <= high) {
			int mid=(low+high)/2;
			if(arr[mid] == searchele) {
				return mid;
			}
			else if(arr[mid] < searchele) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
			return -1;
	}	
	
	
	public static void main(String[] args) {
		int[] arr= {12,45,32,76,4,89};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter search element:");
		int searchele = sc.nextInt();
		int x=arr.length;

		Binary b=new Binary();
		int result = b.search(arr,searchele,0,x-1);
		if(result==-1) {
	    	System.out.println("Element not found");
	    }
	    else 
	    	System.out.println("Element found at index " + result);
		}
	}
