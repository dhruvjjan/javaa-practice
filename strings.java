import java.util.*;
public class strings {
    
    //check if string is palindrome
    public static boolean palindrome(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            if (str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    } 

     
    public static void main (String args[]) {
        String str = "rour";    
        System.out.println(palindrome(str));
    }
}


