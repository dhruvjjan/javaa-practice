import java.util.*;
public class Reverse_Sorting {

    public static void bubble_sort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j] < arr[j+1]){
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

            int minimum_position = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minimum_position] < arr[j]){
                    minimum_position = j;
                }
            }

            //swap
            int temp = arr[minimum_position];
            arr[minimum_position] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion_sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while( prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[ prev+1] = curr;
        }
    }

    public static void counting_sort(int arr[]){
        int largest = Integer.MIN_VALUE;
         for (int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
         }

         int count[] = new int[largest+1];

         for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
         }

         //sorting
         int j = 0;
         for (int i=count.length-1; i>=0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
         }
    }

    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public static void main (String args[]) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        counting_sort(arr);
        printarray(arr);
    } 
}
