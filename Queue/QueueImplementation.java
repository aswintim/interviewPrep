public class QueueImplementation{
   public static void main(String[] args){
   Queue queue = new Queue();
   queue.add(5);
   queue.add(3);
   queue.add(10);
   queue.add(12);
   System.out.println("Peek: 5 "+ queue.peek());
   queue.remove();
   System.out.println("Peek: 3 "+ queue.peek() + " isEmpty: false "+ queue.isEmpty());
   queue.remove();
   System.out.println("Peek: 10 "+ queue.peek());
   queue.remove();
   System.out.println("Peek: 12 "+ queue.peek());
   queue.remove();
   System.out.println("Peek: null "+ queue.peek());
   }

   public static class Queue{
   Node head;
   Node pointer;
   public void add(int val){
   if(head == null){
      head = pointer = new Node(val, null);
   }
   else{
      head.next = new Node(val, null);
      head = head.next;
   }
   }
   
   public void remove(){
      pointer = pointer.next;
   }
   
   public int peek(){
      try{return pointer.val;}
      catch(Exception e){
         System.out.print("Empty queue. ");
      }
      return -1;
   }
   
   public boolean isEmpty(){
      return pointer.next == null;
   }
   
   
   
      public class Node{
         int val;
         Node next;
         public Node(int val, Node next){
            this.val = val;
            this.next = next;
         }
      }
   }
}