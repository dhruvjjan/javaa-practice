import java.util.*;
public class raintrapx {
    public static int trapwater(int heights[]){
        int n = heights.length;
        //leftmax boundary
        int leftmax[] = new int[n];
        leftmax[0] = heights[0];
        for( int i=1; i<n; i++){
            leftmax[i] = Math.max(heights[i], leftmax[i-1]);
        }

        //rightmax boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = heights[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(heights[i], rightmax[i+1]);
        }
         //loop
         int trappedwater = 0;
         for (int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - heights[i];
         }

         return trappedwater;
    }

    public static void main (String args[]){
        int heights[] = {4, 5, 2, 6, 1, 4, 7};
        System.out.println(trapwater(heights));
    }
}
