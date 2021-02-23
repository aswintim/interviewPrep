import java.util.*;

public class SherlockAndAnagrams{
   static int herlockAndAnagrams(String s) {
      Map<String, Integer> hashMap = new HashMap<>();
   
      for(int i=0; i<s.length(); i++){
         for(int j=i; j<s.length(); j++){
            char[] c = s.substring(i, j+1).toCharArray();
            Arrays.sort(c);
            String k = new String(c);
         
         
            if(hashMap.containsKey(k)){
               hashMap.put(k, hashMap.get(k)+1);
            }
            else{
               hashMap.put(k, 1);
            }
         }
      }
      int anagramPairs = 0;
      for(String k : hashMap.keySet()){
         int v = hashMap.get(k);
         anagramPairs += (v*(v-1))/2;
      }
      return anagramPairs;
   
   }

   public static void main(String[] args){
      System.out.println(herlockAndAnagrams("abba"));
   }
}