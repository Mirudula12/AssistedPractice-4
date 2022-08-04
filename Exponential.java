import java.util.Scanner;

public class Exponential {

    int exponentialSearch(int arr[], int searchele) {

        int len = arr.length;

        if (arr[0] == searchele) {  
            return 0;
        }

        int i = 1;

        while (i < len && arr[i] <= searchele) {
            i = i * 2; 

        }

        return binarySearch(arr, i / 2, Math.min(i, len - 1), searchele); 

    }

    int binarySearch(int arr[], int low, int high, int searchele) {

        int mid;

        while (low <= high) {

            mid = (low + high) / 2;

            if (arr[mid] == searchele) {
                return mid;
            } 
            else if (arr[mid] < searchele) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        Exponential search = new Exponential();

        int arr[] = {1,23,45,56,72,101};

        Scanner sc = new Scanner(System.in);
		System.out.println("Enter search element:");
		int searchele = sc.nextInt();
		int str = search.exponentialSearch(arr, searchele);
        if (str == -1) {
            System.out.println("Element not found" );
        }
        else {
            System.out.println("Element found at index " + str);
        }

    }

}