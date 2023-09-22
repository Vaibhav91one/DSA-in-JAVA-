package Trees;

public class isBalanced {
    boolean isBalanced(Node root)
    {
        if(root == null) return true;
        int lh = height(root.left);
        int rh = height(root.right);

        return (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }
    int height(Node node)
    {
        if(node == null){
            return 0;
        }

        return Math.max(height(node.left), height(node.right)) + 1;
    }
}

