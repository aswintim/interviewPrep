import java.util.*;

public class Leet{
   public static void main(String[] args){
      int[] a = {2,2,1,1,1,2,2};
      System.out.println(majorityElement(a));
   }

   static int majorityElement(int[] nums){
     Arrays.sort(nums);
     return nums[nums.length / 2];
           }
}