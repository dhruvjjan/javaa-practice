import java.util.*;
public class javabasics {
    public static int linearsearch(int num[], int key){
        for(int i=0; i<=num.length;i++){
            if (num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num [] = {2, 4, 6, 8, 10, 25, 65, 86};
        int key = 10;
        
        int index = linearsearch(num, key);
        if (index == -1){
            System.out.println("chutiya");
        }
        else{
            System.out.println(index);
        }
        
    }
}

