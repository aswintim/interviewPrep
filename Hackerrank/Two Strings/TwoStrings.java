import java.util.*;

public class TwoStrings{

static String twoStrings(String s1, String s2) {
        Set<Character> a = new HashSet<>();
        Set<Character> b = new HashSet<>();
        
        for(int i=0; i<s1.length(); i++){
            a.add(s1.charAt(i));
        }
        
        for(int i=0; i<s2.length(); i++){
            b.add(s2.charAt(i));
        }
        
        a.retainAll(b);
        
        return (a.isEmpty()) ? "NO" : "YES";
        
    }


public static void main(String[] args){

// Set<String> a = new HashSet<>();
// Set<String> b = new HashSet<>();
// 
// a.addAll(Arrays.asList(new String[]{"Aswin", "Timalsina"}));
// b.addAll(Arrays.asList(new String[]{"is", "a", "good", "aswin"}));
// 
// 
// Set<String> c = new HashSet<>(a);

// c.addAll(b);
// a.add("ging");



System.out.println(twoStrings("aswin", "sima"));

// System.out.println("Hello");
}
}