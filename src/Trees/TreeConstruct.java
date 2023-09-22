package Trees;

import java.util.ArrayList;
import java.util.HashMap;

public class TreeConstruct {

    static int pre_index = 0;
    static HashMap<Integer, Integer> h  = new HashMap<>();
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        for(int i = 0; i < n; i++){
            h.put(inorder[i], i);
        }

        return cTree(inorder, preorder, 0, n - 1);
    }

    static Node cTree(int in[], int pre[], int is, int ie){
        if(is > ie || pre_index >= pre.length) return null;

        Node root = new Node(pre[pre_index++]);

        if(is == ie) return root;

        int Index_middle = h.get(root.data);

        root.left = cTree(in, pre, is, Index_middle - 1);
        root.right = cTree(in, pre,Index_middle + 1, ie);

        return root;
    }

    static void postorder(Node root)
    {
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
}
