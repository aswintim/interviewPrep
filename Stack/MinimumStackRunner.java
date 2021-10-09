public class MinimumStackRunner{
   public static void main(String[] args){
   
      MinStack a = new MinStack();
      a.push(10);
      a.push(11);
      a.push(12);
      a.pop();
      System.out.println("Top 11: "+a.top()+ " Min 10: "+a.getMin());
   
   
   }

   public static class MinStack{
      Node head;
      public void push(int val){
         if(head==null){
            head = new Node(val, val, null);
         }
         else{
            head = new Node(val, Math.min(val, head.val), head);
         }
      }
   
      public void pop(){
         head = head.next;
      }
   
      public int top(){
         return head.val;
      }
   
      public int getMin(){
         return head.min;
      }
   
      public class Node{
         int val;
         Node next;
         int min;
      
         public Node(int val, int min, Node next){
            this.val = val;
            this.next = next;
            this.min = min;
         }
      }
   
   } //MinStack ends
}