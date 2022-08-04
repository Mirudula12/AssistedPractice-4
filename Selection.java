public class Selection {
    void sort(int arr[])
    {
        int n = arr.length;
  
        for (int i = 0; i < n-1; i++)
        {
            
            int index = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[index])
                    index = j;
  
            
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
  
    public static void main(String args[])
    {
        Selection s = new Selection();
        int arr[] = {12,1,56,20,98,67};
        int n = arr.length;
        s.sort(arr);
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}
