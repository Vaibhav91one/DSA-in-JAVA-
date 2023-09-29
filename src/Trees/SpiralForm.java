package Trees;
import java.util.*;

public class SpiralForm {
    public static void main(String[] args){

    }

    static ArrayList<Integer> findSpiral(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        Stack<Node> st = new Stack<>();
        q.add(root);
        boolean reverse = true;

        while(!q.isEmpty()){
            int count = q.size();

            for(int i = 0; i < count; i++){
                Node curr = q.poll();

                if(reverse){
                    st.push(curr);
                }
                else{
                    al.add(curr.data);
                }

                if(curr.left!= null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }

            if(reverse){
                while(!st.isEmpty()){
                    al.add(st.pop().data);
                }
            }

            reverse = !reverse;
        }
        return al;
    }

//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> al = new ArrayList<>();
//        Queue<TreeNode> q = new LinkedList<>();
//        Stack<TreeNode> st = new Stack<>();
//        q.add(root);
//        boolean reverse = false;
//
//        while(!q.isEmpty()){
//            int count = q.size();
//            List<Integer> l = new ArrayList<>();
//            for(int i = 0; i < count; i++){
//                Node curr = q.poll();
//
//                if(reverse){
//                    st.push(curr);
//                }
//                else{
//                    l.add(curr.val);
//                }
//
//                if(curr.left!= null) q.add(curr.left);
//                if(curr.right != null) q.add(curr.right);
//            }
//
//            if(reverse){
//                while(!st.isEmpty()){
//                    l.add(st.pop().val);
//                }
//            }
//            al.add(l);
//            reverse = !reverse;
//        }
//        return al;
//    }

}
