public class diameter {
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
    public static int diam1(Node root){   //approach 1
        if(root==null)
        return 0;
        int ldiam=diam1(root.left);
        int lheight = height(root.left);
        int rdiam=diam1(root.right);
        int rheight=height(root.right);
        int selfdiam=rheight+lheight+1;
        return Math.max(selfdiam,Math.max(ldiam,rdiam));
    }
    
    static class Info{
        int diame;
        int ht;
        public Info(int diame,int ht){
            this.diame=diame;
            this.ht=ht;
        }
    }
    public static Info diam2(Node root){
    if(root==null){
        return new Info(0,0);
    }
       Info leftinfo=diam2(root.left);
       Info rightinfo=diam2(root.right);
       int diame=Math.max(Math.max(leftinfo.diame,rightinfo.diame),leftinfo.ht+rightinfo.ht+1);
       int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
       return new Info(diame,ht);
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

// System.out.println(diam1(root)); 
System.out.println(diam2(root).diame);
}
}
