package BST;

public class CheckForBST {
    class Node{
        Node left;
        Node right;

        int data;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){

    }

    int prev = Integer.MIN_VALUE;
    boolean isBST(Node root)
    {
        if(root == null) return true;

        if(!isBST(root.left)) return false;

        if(root.data <= prev) return false;

        prev = root.data;

        return isBST(root.right);
    }

}
