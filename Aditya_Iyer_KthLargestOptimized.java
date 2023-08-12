/*Aditya K Iyer*/
import java.util.*;

class kthLargest{

    public static int partition(int[] arr, int lb, int ub){
        int i = lb;
        int j = ub;
        int pivot = i;
        int temp = 0;
        
        while(i<j){
            while(arr[i]<=arr[pivot])
                i++;
            while(arr[j]>arr[pivot])
                j--;
            
            if(i<j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static int quickSelect(int[] arr, int lb, int ub, int k){
         if(lb<ub){
            int pvt = partition(arr,lb,ub);
            if(pvt == k)
                return arr[k];
            else if(pvt<k)
                return quickSelect(arr, pvt+1, ub, k);
            
            return quickSelect(arr, lb, pvt-1, k);
         }
         return -1;
    }
    public static void main(String[] args) {
        
        int[] arr = {14,7,19,81,22,34,54,97};
        
        

                
        System.out.println(quickSelect(arr,0,arr.length-1,arr.length-6));    
        
        }
    }
