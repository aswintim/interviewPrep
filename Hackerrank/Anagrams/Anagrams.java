import java.util.*;

public class Anagrams{
public static void main(String[] args){
String a = "anagramm";
String b = "maragnam";
a = a.toLowerCase();
b = b.toLowerCase();

HashMap <Character, Integer> map0 = new HashMap<>();
HashMap <Character, Integer> map1 = new HashMap<>();

for(int i =0; i<a.length(); i++){
   char fromA = a.charAt(i);
   int number = 0;
   for(int j=0; j<a.length(); j++){
      if(fromA == a.charAt(j)){
      number++;
      }
   }
   map0.put(fromA, number);
}

for(int i =0; i<b.length(); i++){
   char fromB = b.charAt(i);
   int number = 0;
   for(int j=0; j<b.length(); j++){
      if(fromB == b.charAt(j)){
      number++;
      }
   }
   map1.put(fromB, number);
}


System.out.println(map0);
System.out.println(map1);
System.out.println(map0.equals(map1));
// a.toLowerCase().replaceAll("a", ""));

}
}