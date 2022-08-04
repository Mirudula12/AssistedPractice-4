public class Merge {  
   
	void merge(int arr[], int beg, int mid, int end)    
	{    
		int i,j,k;  
		int n1 = mid-beg+1;    
		int n2 = end-mid;    
       
        int leftarr[] = new int[n1];  
        int rightarr[] = new int[n2];  
      
     
        for (i = 0; i < n1; i++)    
        	leftarr[i] = arr[beg + i];    
        for (j = 0; j < n2; j++)    
        	rightarr[j] = arr[mid+1+j];    
      
        i = 0;  
        j = 0;   
        k = beg;    
      
        while (i<n1 && j<n2)    
        {    
        	if(leftarr[i] <= rightarr[j])    
        	{    
        		arr[k]=leftarr[i];    
        		i++;    
        	}    
        	else    
        	{    
        		arr[k]=rightarr[j];    
        		j++;    
        	}    
        	k++;    
        }    
        while (i<n1)    
        {    
        	arr[k]=leftarr[i];    
        	i++;    
        	k++;    
        }    
      
        while (j<n2)    
        {    
        	arr[k]=rightarr[j];    
        	j++;    
        	k++;    
        }    
	}    
  
	void sort(int arr[], int beg, int end)  
	{  
		if (beg<end)   
		{  
			int mid = (beg+end)/2;  
			sort(arr,beg,mid);  
			sort(arr,mid+1,end);  
			merge(arr,beg,mid,end);  
		}  
	}  
   
	public static void main(String args[])  
	{  
		int arr[] = {33,2,54,1,65,77,98};  
		int n = arr.length;  
		Merge m = new Merge();  
		m.sort(arr, 0, n - 1);  
		System.out.println("Merge Sort:");  
		int i;  
		for (i=0; i<n; i++)  
			System.out.print(arr[i] + " ");    
	}  
  
} 

