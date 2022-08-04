public class Quick {
	
	public static int arrPartition(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int i = (start-1);
		for (int j=start; j<end; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;
		return i+1;
	}
	
	public void sort(int[] arr, int start, int end) {
		
		if (start < end) {
			int pivot = arrPartition(arr, start, end);
			sort(arr, start, pivot - 1);
			sort(arr, pivot + 1, end);
		}
	}
	
	public static void main(String[] args) {
		
		Quick q = new Quick();
		int[] arr = {34,26,45,7,98,190,87};
		int n=arr.length;
		q.sort(arr, 0, arr.length - 1);
		int i;  
		for (i=0; i<n; i++)  
			System.out.print(arr[i] + " "); 
	}
}
