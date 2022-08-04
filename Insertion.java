public class Insertion {
    
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; i++) {
            int searchele = arr[i];
            int j = i-1;
  
            while (j >= 0 && arr[j] > searchele) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = searchele;
        }
    }
  
    public static void main(String args[])
    {
        int arr[] = {32,44,65,1,78,55};
        int n = arr.length;
        Insertion in = new Insertion();
        in.sort(arr);
        System.out.println("Insertion Sort:");
        for (int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
     
    }
}
