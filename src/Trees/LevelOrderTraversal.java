package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class LevelOrderTraversal {
    public static void main(String[] args){

    }

    static ArrayList <Integer> levelOrdergfg(Node node)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node curr = q.poll();
            al.add(curr.data);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }

        return al;
    }

//    public List<List<Integer>> levelOrder(Node root) {
//        List<List<Integer>> al = new ArrayList<>();
//        if(root == null) return al;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        while(!q.isEmpty()){
//            int count = q.size();
//            List<Integer> l = new ArrayList<>();
//            for(int i = 0; i < count; i++){
//                TreeNode curr = q.poll();
//                l.add(curr.val);
//                if(curr.left != null) q.add(curr.left);
//                if(curr.right != null) q.add(curr.right);
//            }
//            al.add(l);
//        }
//        return al;
//    }
}
