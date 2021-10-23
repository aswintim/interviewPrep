public class BubbleSort{
   public static void main(String[] args){
      int[] a = {5,2,8,9,6,1,7};
      int[] b = bubbleSort(a);
      for(int i:b){
         System.out.println(i);
      }
   }
   
   public static int[] bubbleSort(int[] a){
      boolean sorted = false;
      int unsortedLength = a.length-1;
      while(!sorted){
         sorted = true;
         for(int i = 0; i<unsortedLength; i++){
            if(a[i+1]<a[i]){
               int backup = a[i];
               a[i] = a[i+1];
               a[i+1]=backup;
               sorted = false;
            }
         }
         unsortedLength--;
      }
   return a;
   }
   
   

   public static int[] bubbleSortTwoWays(int[] a){
      boolean sorted = false;
      int unsortedLength = a.length - 1;
      while(!sorted){
         sorted = true;
         for(int i =0, j = unsortedLength; i<unsortedLength; i++, j--){
            if(a[i+1]<a[i]){
               sorted = false;
               int backup = a[i];
               a[i] = a[i+1];
               a[i+1] = backup;
            }
            if(j-1>0){
               if(a[j]<a[j-1]){
                  sorted = false;
                  int backup = a[j];
                  a[j] = a[j-1];
                  a[j-1]=backup;
               }}
         }
      }
      return a;
   }

}