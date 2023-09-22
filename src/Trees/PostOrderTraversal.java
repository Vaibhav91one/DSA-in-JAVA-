package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {

    static ArrayList<Integer> al = new ArrayList<>();
    static ArrayList<Integer> postorder(Node root)
    {
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            al.add(root.data);
        }
        return al;
    }
}
