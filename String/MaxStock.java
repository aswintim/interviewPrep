public class MaxStock{
   public static void main(String[] args){
      int[] prices = {2,1,2,1,0,1,2};
      System.out.println(maxProfit(prices));
   }

   // public static int maxProfit(int[] prices){
      // int max = 0;
      // for(int i=0; i<prices.length; i++){
         // for(int j=i+1; j<prices.length; j++){
         // int a = prices[i];
         // int b = prices[j];
            // if(a>b){
               // continue;
            // }
            // else{
               // int val = b-a;
               // if( val > max){
                  // max = val;
               // }
            // }
         // }
      // }
      // return max;
   // }
   
   
   public static int maxProfit(int[] prices){
      int max = 0;
      int buy = prices[0];
      int sell = 0;
      if(prices.length == 0) return 0;
      for(int i=1; i<prices.length; i++){
         if(buy>=prices[i]){
            buy = prices[i];
            continue;
         }
         else if(prices[i] > sell || prices[i]-buy>max){
            sell = prices[i];
            max = sell-buy;}
      }
   
      return max;
   
   
   }
   
}