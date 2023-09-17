package Trees;
import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversal {
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        s.push(root);

        while(!s.isEmpty()){
            Node curr = s.pop();
            al.add(curr.data);

            if(curr.right != null){
                s.push(curr.right);
            }

            if(curr.left != null){
                s.push(curr.left);
            }
        }

        return al;
    }
}
