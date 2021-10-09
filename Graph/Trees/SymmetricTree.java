import java.util.*;

public class SymmetricTree{
public static void main(String[] args){
   TreeNode a = new TreeNode();
   a.val = 15;
   a.left = new TreeNode(20, new TreeNode(30), new TreeNode(60));
   a.right = new TreeNode(20, new TreeNode(60), new TreeNode(30));
   System.out.println(isSymmetric(a));
}
public static boolean isSymmetric(TreeNode root) {
        Stack<Integer> leftStack = new Stack();
        Stack<Integer> rightStack = new Stack();
        
        leftSection(leftStack, root);
        rightSection(rightStack, root);
        
        return comparison(leftStack, rightStack);
        
    }
    
    public static boolean comparison(Stack<Integer> left, Stack<Integer> right){
        if(left.size() != right.size()) return false;
        else{
            while(!left.isEmpty()){
                if(left.pop() != right.pop()) return false;
            }
        }
        return true;
    }
    
    public static void leftSection(Stack<Integer> leftStack, TreeNode root){
        //base
    if(root==null){leftStack.push(null);}
       if(root!=null){
        leftSection(leftStack, root.left);
        leftStack.push(root.val);
        leftSection(leftStack, root.right);}
    }
    
    public static void rightSection(Stack<Integer> rightStack, TreeNode root){
            if(root==null){rightStack.push(null);}
            if(root!=null){
            rightSection(rightStack, root.right);
            rightStack.push(root.val);
            rightSection(rightStack, root.left);}
        
    }
public static class TreeNode{
   int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}
}