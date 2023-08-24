
import java.util.*;
public class sorting {

    public static void bubble_sort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selection_sort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int min_position = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[min_position] > arr[j]){
                    min_position = j;
                }
            }
            //swap
            int temp = arr[min_position];
            arr[min_position] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion_sort(int arr[]){

        for(int i=0; i<arr.length; i++){

            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr [prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr [prev + 1] = curr;
        }
    }

    public static void counting_sort(int arr[]){

        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++ ){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


      public static void main (String args[]) {
        int ar[] = {4,5,1,3,2};
        counting_sort(ar);
        printarr(ar);
    }  
    
    /* //Default Sorting(inbuilt sort)
        import java.util.Arrays;
        public static void main(String args[]){
            int arr[] = {5,3,4,1,2};
            Arrays.sort(arr);
            printarr(arr);
        }
     */
}
