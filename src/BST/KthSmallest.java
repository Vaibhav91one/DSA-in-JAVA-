package BST;

public class KthSmallest {
    class Node{
        Node left;
        Node right;
        int val;

        Node(int val){
            this.val = val;
        }
    }

    int count = 0;
    int results = 0;
    public int KthSmallestElement(Node root, int K) {
        return Helper(root,K);
    }

    public int Helper(Node root, int K) {
        if(root == null){
            return 0;
        }
        Helper(root.left, K);
        count++;
        if(count == K){
            results = root.val;
        }
        Helper(root.right,K);

        return results == 0? -1 : results;
    }
}
