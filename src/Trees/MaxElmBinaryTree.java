package Trees;

class Node{
    int data;
   Node left;
    Node right;

    Node(int key){
        this.data = key;
    }
}

public class MaxElmBinaryTree {
    public static int findMax(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
    }
    public static int findMin(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(findMin(root.left), findMin(root.right)));
    }
}