import java.util.Arrays;

public class MaxHeapImplementation{

   private int capacity = 10;
   public int size = 0;    //index of last item
   public int[] items = new int[capacity];

   public boolean hasRightChild(int index){
      return getRightChildIndex(index) < size;
   }

   public boolean hasLeftChild(int index){
      return getLeftChildIndex(index) < size;
   }


   public boolean hasParent(int index){
      return getParentIndex(index) >= 0;
   }


   public int getLeftChildIndex(int index){
      return 2 * (index+1);
   }

   public int getRightChildIndex(int index){
      return 2 * (index+2);
   }

   public int getParentIndex(int index){
      return (index-1)/2;
   }
   
   public int leftChild(int index){
      return items[getLeftChildIndex(index)];
   }
   
   public int rightChild(int index){
      return items[getRightChildIndex(index)];
   }
   
   public int parent(int index){
      return items[getParentIndex(index)];
   }
   
   private void swap(int indexOne, int indexTwo){
      int swapping = items[indexOne];
      items[indexOne] = items[indexTwo];
      items[indexTwo] = swapping;
   }
   
   private void ensureCapacity(){
      if(size==capacity){
         items = Arrays.copyOf(items, capacity*2);
         capacity*=2;
      }
   }
   
   public int peek(){
      if(size==0) throw new IllegalStateException();   
      return items[0];
   }
   
   public int pop(){
   if(size==0) throw new IllegalStateException();
   int ret = items[0];
   items[0] = items[size-1];
   size--;
   heapifyDown();
   return ret;
   }
   
   public void insert(int data){
   ensureCapacity();
   items[size]=data;    //lets say there is no element in the array. we are adding value 4. items[0] = 4 now the size is 1.
   size++;
   heapifyUp();
   
   }
   
   public void heapifyUp(){
   int index = size-1;
   while(hasParent(index) && parent(index) < items[index]){
   swap(getParentIndex(index), index);
   index = getParentIndex(index);
   }
   }
   
   public void heapifyDown(){
   int index = 0;
   while(hasLeftChild(index)){
   int greaterChildIndex = getLeftChildIndex(index);
   if(hasRightChild(index) && rightChild(index)>leftChild(index)){
   greaterChildIndex = getRightChildIndex(index);
   }
   
   if(items[index] > items[greaterChildIndex]) return;
   
   else{
   swap(index, greaterChildIndex);
   index = greaterChildIndex;
   }
   }
   }
   
   public void heapSort(){
   int sizeUse = size;
   int[] sorted = new int[size];
   for(int i = sizeUse-1; i>=0; i--){
   int max = pop();
   sorted[i] = max;
   }
   
   for(int i=0; i<sizeUse; i++){
   System.out.println(sorted[i]);
   }
   }
   
   

   public static void main(String[] args){
   MaxHeapImplementation theHeap = new MaxHeapImplementation();
   theHeap.insert(10);
   theHeap.insert(20);
   theHeap.insert(10);
   theHeap.insert(32);
   theHeap.insert(20);
   theHeap.insert(10);
   theHeap.insert(15);
   
   System.out.println(theHeap.peek());
   for(int i=0; i<theHeap.size; i++){
   System.out.println(theHeap.items[i]);
   }
   
   System.out.println();
   theHeap.heapSort();
   
   }
}