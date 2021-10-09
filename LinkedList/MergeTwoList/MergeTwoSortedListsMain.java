import java.util.*;
public class MergeTwoSortedListsMain{
public static void main(String[] args){
LinkedList<Integer> l1 = new LinkedList<>();
LinkedList<Integer> l2 = new LinkedList<>();
l1.add(1);
l1.add(2);
l1.add(4);
l2.add(1);
l2.add(3);
l2.add(4);
System.out.println(mergeTwoLists(l1, l2));
}


    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // If l1 is null return l2 and viceversa
    if(l1 == null) return l2;
    if(l2 == null) return l1;
    
    // Create a new linked list of type ListNode named headNode that will go through both the L.L and combine them in sorted order
    ListNode headNode;
    
    // Here if the first value of L.L l1 is less than or equal to l2 then point headNode to l1 and l1 to the next address and vicevera with l2.
    if(l1.val <= l2.val){
        headNode = l1;
        l1 = l1.next;
    }
    else{
        headNode = l2;
        l2 = l2.next;
    }
    
    // Creating a new node ans which will point to the headNode and in last ans node will be returned
    ListNode ans = headNode;
    
    // Run the while loop until either l1 becomes null or l2 becomes null
    while(l1 != null && l2 != null){
        // If l1 data value is less than or equal to l2 data then update the headNode to l1 and l1 to l1's next node 
        // and  same with in else case but considering on l2 node
        if(l1.val <= l2.val){
            headNode.next = l1;
            l1 = l1.next;
        }
        else{
            headNode.next = l2;
            l2 = l2.next;
        }
        // After that update the headNode to its next node
        headNode = headNode.next;
    }
    
    // If l1 travesed till null then point the headNode.next to l2 
    if(l1 == null) headNode.next = l2;
    // else to l1 node
    else headNode.next = l1;
    
    // Return the original staring refrence to the headNode whic we have stored in ans node.
    return ans;
}
}
