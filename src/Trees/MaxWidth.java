package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {

//    class Node{
//        TreeNode node;
//        int idx;
//        Node(TreeNode node, int idx){
//            this.node = node;
//            this.idx = idx;
//        }
//    }

    int getMaxWidth(Node root) {
        if(root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        int res = 0;
        q.add(root);

        while(!q.isEmpty()){
            int count = q.size();
            res = Math.max(res, count);

            for(int i = 0; i < count; i++){
                Node curr = q.poll();
                if(curr.left!= null) q.add(curr.left);
                if(curr.right!= null) q.add(curr.right);
            }
        }

        return res;
    }

//    public int widthOfBinaryTree(TreeNode root) {
//        Queue<Node> q = new LinkedList<>();
//        int res = 0;
//        q.add(new Node(root, 0));
//
//        while(!q.isEmpty()){
//            int count = q.size();
//            int start = 0;
//            int end = 0;
//            for(int i = 0; i < count; i++){
//                Node curr = q.poll();
//                int index = curr.idx;
//
//                if(i == 0){
//                    start = index;
//                }
//
//                if(i == count - 1){
//                    end = index;
//                }
//
//                if(curr.node.left != null) q.add(new Node (curr.node.left, 2*curr.idx));
//                if(curr.node.right != null) q.add(new Node (curr.node.right, 2*curr.idx + 1));
//            }
//            res = Math.max(res,end - start+1);
//        }
//
//        return res;
//    }
}
