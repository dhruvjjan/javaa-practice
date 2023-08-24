public class recursion {
    public static void pInc (int n){
        if (n==1){
            System.out.print(1 + " ");
            return;
        }
        pInc(n-1);
        System.out.print(n + " ");
    }

    public static void  pDec (int n){
        if (n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        pDec(n-1);
    }

    public static int fact (int n){
        if (n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }

    public static int fib (int n){
        if (n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //calculate sum of n no.
    public static int calsum(int n){
        if( n==1){
            return 1;
        }
        int snm1 = calsum(n-1);
        int sn = n + snm1;
        return sn;
        
    }

    public static boolean isSort(int arr[], int i){
        if (i == arr.length-1){
            return true;
        }
        if( arr[i] > arr[i+1]){
            return false;
        }
        return isSort(arr, i+1);
    }

    public static int firstoccurance(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firstoccurance(arr, key, i+1);
    }

    public static int lastoccurence(int arr[], int key, int i){
        
        if (i==arr.length){
            return -1;
        }
        int isfound = lastoccurence(arr, key, i+1);
        if(isfound != -1){
            return isfound;
        }
        if(arr[i] == key){
            return i;
        }
        return isfound
        ;
    } {
        
    }
    public static void main (String args[]) {
        int arr[] = {1, 2, 3, 4, 9, 5, 4, 7};
        System.out.println(lastoccurence(arr, 4, 0));
    } 
}

