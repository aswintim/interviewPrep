import java.util.*;

public class SieveOfEratosthenes{
   public static void main(String[] args){
   boolean[] a = sieveOfEratosthenes(50);
   for(int i=0; i<a.length; i++){
   System.out.println(i+") "+a[i]);
   }
   
   }

   public static boolean[] sieveOfEratosthenes(int max){
      boolean[] flags = new boolean[max+1];
      // int count = 0;
   
      Arrays.fill(flags, true); //sets all flag to true other than 0 and 1
      int prime = 2;
   
      while(prime<=Math.sqrt(max)){
         crossOff(flags, prime); //cross off remaining multiples of prime
         prime=getNextPrime(flags,prime); //find next value which is true
      }
      
      return flags;
   
   }
   
   public static void crossOff(boolean[] flags, int prime){
      for(int i = prime*prime; i<flags.length; i+=prime){
         flags[i]=false;
      }
   }
   
   public static int getNextPrime(boolean[] flags, int prime){
   int next = prime+1;
   while(next<flags.length && !flags[next]){
   next++;
   }
   return next;
   }
}