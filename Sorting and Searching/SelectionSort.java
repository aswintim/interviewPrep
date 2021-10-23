public class SelectionSort{
   public static void main(String[] args){
   int[] a = {2,8,5,3,9,4,1};
   int[] b = selectionSort(a);
      for(int i:b){
      System.out.println(i);
      }
   }
   
   public static int[] selectionSort(int[] a){
      for(int i =0; i<a.length; i++){
      int minIndex = i;
         for(int j = i+1; j<a.length; j++){
            if(a[j]<a[minIndex]){
               minIndex = j;
            }
         }
         if(a[minIndex]!=a[i]){
         int backup = a[i];
         a[i] = a[minIndex];
         a[minIndex] = backup;}
      }
      return a;
   }

}