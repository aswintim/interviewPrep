public class BinarySearchTreeImplementation{
   Node root; //every single tree, no matter what it is, is going to have a root node
   
   public void addNode(int data){
      Node newNode = new Node(data);
      
      if(root == null){
         root = newNode;
      }
      
      else{
         Node focusNode = root;
         Node parent;
      
         while(true){
            parent = focusNode;
            
            if(data <= focusNode.data){
               focusNode = focusNode.left;
               
               if(focusNode == null){
                  parent.left = newNode;
                  return; //why is there no else part???
               }
               
            }
            
            else{
               focusNode = focusNode.right;
               if(focusNode == null){
                  parent.right = newNode;
                  return;
               }
            }
         }
      }
   }//addNode ends
   
   public void inOrderTraversal(Node node){
      if(node!=null){
         inOrderTraversal(node.left);
         System.out.println(node.data);
         inOrderTraversal(node.right);
      }
   }
   
   public void preOrderTraversal(Node node){
      if(node!=null){
         System.out.println(node.data);
         preOrderTraversal(node.left);
         preOrderTraversal(node.right);
      }
   }
   
   public void postOrderTraversal(Node node){
      if(node!=null){
         postOrderTraversal(node.left);
         postOrderTraversal(node.right);
         System.out.println(node.data);
      }
   }
   
   public boolean findNode(int key){
      Node focusNode = root;
      
      while(focusNode.data != key){
      if(key < focusNode.data){
      focusNode = focusNode.left;
      }
      
      else{
      focusNode = focusNode.right;
      }
      
      if(focusNode == null){
      return false;
      }
      }
      
      return true;
   }
   

  

   public static void main(String[] args){
   BinarySearchTreeImplementation theTree = new BinarySearchTreeImplementation();
   theTree.addNode(50);
   theTree.addNode(60);
   theTree.addNode(20);
   theTree.addNode(40);
   theTree.addNode(30);
   theTree.addNode(70);
   theTree.addNode(50);
   
    System.out.println("Inorder Traversal: ");
   theTree.inOrderTraversal(theTree.root);
   System.out.println("Preorder Traversal: ");
    theTree.preOrderTraversal(theTree.root);
    System.out.println("Postorder Traversal: ");
     theTree.postOrderTraversal(theTree.root);
     
     
     System.out.println(theTree.findNode(60));
   }
}
