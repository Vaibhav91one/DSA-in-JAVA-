package BST;

public class TwoNodesSwapped {
    class Node{
        Node left;
        Node right;

        int data;

        Node(int data){
            this.data = data;
        }
    }
    public void recoverTree(Node root) {

    }

    Node prev = null, first = null, second = null;
    public Node correctBST(Node root)
    {
        Helper(root);
        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        return root;
    }

    public void Helper(Node root){
        if(root == null) return;

        Helper(root.left);

        if(prev != null && root.data < prev.data){
            if(first == null){
                first = prev;
            }
            second = root;
        }

        prev = root;
        Helper(root.right);
    }

}
