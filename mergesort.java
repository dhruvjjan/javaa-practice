public class mergesort {
    
    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++ ) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[]) {
        if (arr==null ||arr.length<2){
            return;
        }
        int n=arr.length;
        int temp[] = new int[n];
        mergehelp(arr, temp, 0, n-1);
        
    }

    public static void mergehelp(int arr[], int temp[],int si, int ei) {
        if(si < ei){
            int mid = (si+(ei-si))/2;

            mergehelp(arr, temp, si, mid);
            mergehelp(arr, temp, mid+1, ei);
            merge(arr, temp, si, mid, ei);
        }
    }

    public static void merge(int arr[], int temp[],int si,int mid, int ei) {
        for (int i = si; i < ei; i++) {
            temp[i]=arr[i];
        }
        int i=si , j=mid+1, k=si;

        while (i<=mid && j<=ei) {
            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            }else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            arr[k]= temp[i];
            i++ ; k++;
        }
    }

    public static void main (String args[]) {
        int arr[] = {6,7,4,6,4,2,8,0};
        mergeSort(arr);
        printArr(arr);
    } 
}
