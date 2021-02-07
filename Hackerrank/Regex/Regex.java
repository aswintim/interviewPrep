import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.*;

public class Regex{
public static void main(String[] args) throws IOException{

         int[] ar = {3,3,3,3,2,2,2,2};
//          {1 1 1 2 2 2 3 3 3 3 5 5 5 5 6}
         int n = ar.length;
         Arrays.sort(ar);
        
        int count = 1;
        int pair = 0;
        for(int i=0; i<n; i++){
        try{
            int a = ar[i];
            int a0;
            try{
            a0 = ar[i-1];}
            catch(ArrayIndexOutOfBoundsException e){
            a0 = 0;
            ;}
            int a1 = ar[i+1];
            
            if(a0!=a){
               count=1;
            }
            
            if(a1 == a){
                count++;
            }
            }
            catch(ArrayIndexOutOfBoundsException e){continue;}
            
            if(count==2){
                pair++;
                count = 0;
            }
            
        }
        System.out.print(pair);   //answer 6


}
}
