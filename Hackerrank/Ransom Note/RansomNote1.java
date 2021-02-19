import java.util.HashMap;

public class RansomNote1{

   static void checkMagazine(String[] magazine, String[] note) {
      HashMap<String, Integer> mag = new HashMap<>();
   
      for(int i=0; i<magazine.length; i++){
         String word = magazine[i];
         int value = 1;
         if(!mag.containsKey(word)){
            mag.put(word, value);
         }
         else{
            mag.put(word, mag.get(word)+1);
         }
      }
      boolean flag = false;
      for(int i=0; i<note.length; i++){
         if(mag.containsKey(note[i]) && mag.get(note[i])>0){
            mag.put(note[i], mag.get(note[i])-1);
            flag = true;
         }
         else{
         flag = false;
         break;}
      }
      String a = (flag) ? "Yes" : "No";
      System.out.println(a);
      
   } 
   public static void main(String[] args){
      String[] magazine = {"two", "is", "three", "is", "three", "four"};
      String[] note = {"two", "three", "three", "three", "is", "four"} ;
      checkMagazine(magazine, note);
   }
}