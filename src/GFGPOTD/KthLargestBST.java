package GFGPOTD;

public class KthLargestBST {
    int ans = 0;
    int count = 0;
    public int kthLargest(Node root,int K)
    {
        revInorder(root, K);
        return ans;
    }

    void revInorder(Node root, int k){
        if(root == null) return;
        revInorder(root.right,k);
        count++;
        if(count == k){
            ans = root.data;
            return;
        }
        revInorder(root.left, k);
    }
}
