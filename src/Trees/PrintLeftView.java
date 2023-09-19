package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
public class PrintLeftView {
    public static void main(String[] args){

    }

    int maxLevel = 0;

    void leftView(Node root, int level){
        if(root == null){
            return;
        }

        if(maxLevel < level){
            System.out.println(root.data);
            maxLevel = level;
        }

        else{
            leftView(root.left, level+1);
            leftView(root.right, level+1);
        }
    }

    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null) return al;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int count = q.size();

            for(int i = 0; i < count; i++){
                Node curr = q.poll();
                if(i == 0){
                    al.add(curr.data);
                }
                if(curr.left!= null) q.add(curr.left);
                if(curr.right!= null) q.add(curr.right);
            }
        }

        return al;
    }

//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> al = new ArrayList<>();
//        if(root == null) return al;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//
//        while(!q.isEmpty()){
//            int count = q.size();
//
//            for(int i = 0; i < count; i++){
//                TreeNode curr = q.poll();
//                if(i == count -1){
//                    al.add(curr.val);
//                }
//                if(curr.left!= null) q.add(curr.left);
//                if(curr.right!= null) q.add(curr.right);
//            }
//        }
//
//        return al;
//    }
}
