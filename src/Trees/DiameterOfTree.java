package Trees;


public class DiameterOfTree {

//    public int diameterOfBinaryTree(TreeNode root) {
//        height(root);
//        return res;
//    }
//
    int res = 0;
//    int height(TreeNode root) {
//        if(root == null) return 0;
//
//        int lh = height(root.left);
//        int rh = height(root.right);
//
//        res = Math.max(res, lh+rh);
//
//        return 1+Math.max(lh,rh);
//    }
    int height(Node root) {
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        res = Math.max(res, 1+lh+rh);

        return 1+Math.max(lh,rh);
    }


}
