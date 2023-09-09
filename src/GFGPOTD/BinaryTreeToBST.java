package GFGPOTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class BinaryTreeToBST {
    int i = 0;
    Node binaryTreeToBST(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        getNodes(root,al);
        Collections.sort(al);
        inorder(root,al);
        return root;
    }

    void getNodes(Node root, ArrayList<Integer> al){
        if(root == null) return;
        al.add(root.data);
        getNodes(root.left, al);
        getNodes(root.right, al);
    }

    void inorder(Node root, ArrayList<Integer> al){
        if(root == null) return;
        inorder(root.left, al);
        root.data = al.get(i++);
        inorder(root.right, al);
    }
}
