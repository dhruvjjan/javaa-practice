import java.util.*;

public class matrices {
    // //To search in any matrix
    // public static boolean search (int matrix[][], int key){
    //     for ( int i=0; i<matrix.length; i++){
    //         for ( int j=0; j<matrix[0].length; j++){
    //             if (matrix[i][j] == key){
    //                 System.out.println("found key at (" + i + "," + j + ")");
    //                 return true;
    //             }
    //         }
    //     }
    //     System.out.println("key not found");
    //     return false;
    // }

    // //creating and taking matrix (or 2D array) as input
    // public static void main (String args[]) {
    //     int matrix[][] = new int[3][3];
    //     int n = matrix.length, m = matrix[0].length;
         
    //     //input
    //     Scanner sc = new Scanner(System.in);
    //     for( int i=0; i<matrix.length; i++){
    //         for( int j=0; j<matrix[0].length; j++){
    //             matrix[i][j] = sc.nextInt();

    //         }
    //     }

    //     //output
    //     for( int i=0; i<matrix.length; i++){
    //         for( int j=0; j<matrix[0].length; j++){
    //             System.out.print(matrix[i][j]+" ");    
    //         }
    //         System.out.println();
    //     }
    //     int key = sc.nextInt();
    //     search(matrix, key);
    // } 

    //spiral matrix
    public static void print_spiral (int matrix[][]) {
        int startrow =0;
        int startcol =0;
        int endrow =matrix.length-1;
        int endcol =matrix[0].length-1;

        while( startrow <= endrow && startcol <= endcol){

            //top
            for(int j=startcol; j<=endcol; j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            //right
            for(int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            //bottom
            for(int j=endcol-1; j>=startcol; j--){
                if (startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }

            //left
            for(int i=endrow-1; i>=startrow+1; i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
        System.out.println();
    }

    //Brute force approach [time complexity = O(n^2)]
    public static int diagonal_sum1(int matrix[][]){
        int sum=0;

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (i==j){
                    sum += matrix[i][j];
                }
                else if (i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
        return sum;
    }

    //a more optimal approach [time complexity = O(n)]
    public static int diagonal_sum2(int matrix[][]){
        int sum=0;

        for (int i=0; i<matrix.length; i++){
            sum += matrix[i][i];
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
        return sum;
    }

    //staircase is a searching technique use here {for (0,m-1)}
    public static boolean staircase(int matrix[][], int key){
        
        int row=0, column = matrix[0].length-1;

        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == key){
                System.out.println("found key at (" + row + "," + column +")");
                return true;
            }
            else if(key < matrix[row][column]){
                column--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    //for(n-1,0)
    // public static boolean staircase1(int matrix[][], int key){
        
    //     int row=0, column = matrix[0].length-1;

    //     while(row>=0 && column <matrix[0].length){
    //         if(matrix[row][column] == key){
    //             System.out.println("found key at (" + row + "," + column +")");
    //             return true;
    //         }
    //         else if(key < matrix[row][column]){
    //             column++;
    //         }
    //         else{
    //             row--;
    //         }
    //     }
    //     System.out.println("key not found");
    //     return false;
    // }

    

    public static void main (String args[]) {
        int matrix[][] ={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };
        int key = 11;
        staircase(matrix, key);
    } 
}
