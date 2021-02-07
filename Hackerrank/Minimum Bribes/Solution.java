import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   // Complete the minimumBribes function below

   public static void main(String[] args) {
      int arr[] = new int[]{1,4,3,2};
      boolean isVisited[] = new boolean[arr.length+1]; //??why +1
      HashMap<Integer, Integer> nodeMap = new HashMap<Integer, Integer>();
      for(int i = 1; i< isVisited.length; i++){
         nodeMap.put(i, arr[i-1]);
      }
      int countSwap = 0;
      for(int k=1; k<=nodeMap.size(); k++){
         int nextNode;
         if(isVisited[k]==false){
         isVisited[k]=true;
         
         if(k == nodeMap.get(k)){
            continue;
         }
         else{
            int c = nodeMap.get(k);
            while(!isVisited[c]){
            isVisited[c] = true;
            nextNode = nodeMap.get(c);
            c = nextNode;
            ++countSwap;
            }
         }
         }
      }
      System.out.println(countSwap);
      
   }
}
