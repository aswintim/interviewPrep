public class LinkedList1{
Node1 head;

public void insert(int data){
Node1 node = new Node1();
node.data = data;
node.next = null;

if(head == null){
head = node;
}

else{
Node1 n = head;

while(n.next != null){
n = n.next;
}
n.next = node;
}

} //insert ends

public void show(){
Node1 n = head;
while(n.next != null){
System.out.println(n.data);
n = n.next;
}
System.out.println(n.data);
} //show ends
} //class ends