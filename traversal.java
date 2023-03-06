import java.util.*;
public class traversal {
   
        static class Node {
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        public static void preorder(Node root){ //preorder traversal
            if(root == null){
                return ;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data +" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data +" ");
        }
        public static void levelorder(Node root){
            if(root==null){
              return;
            }
              Queue<Node> q= new LinkedList<>();
              q.add(root);
              q.add(null);
              while(!q.isEmpty()){
               Node currNode=q.remove();
               if(currNode==null){
                System.out.println();
               if(q.isEmpty()){
                break;
               }else{
                q.add(null);
               }
               }System.out.print(currNode.data +" ");
            if(currNode.left != null){
                q.add(currNode.left);
            }
        if(currNode.right != null){
            q.add(currNode.right);
        }}

              }
              public static int height(Node root){
                if(root==null){
                    return 0;
                }
                int lh = height(root.left);
                int rh = height(root.right);
                return Math.max(lh,rh)+1;
              }
    
        
        public static void main(String args[] ){
       Node root =new Node(1);
        root.left =new Node(2);
        root.right =new Node(3);
        root.left.left =new Node(4);
        root.left.right =new Node(5);
        root.right.left =new Node(6);
        root.right.right =new Node(7);
       //preorder(root);
      // inorder(root);
        // postorder(root);
        // levelorder(root);
       System.out.println(height(root)); 
    }
    
    
}
