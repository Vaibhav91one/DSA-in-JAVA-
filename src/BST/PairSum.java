package BST;

import java.util.HashSet;
import java.util.TreeSet;

public class PairSum {
    class Node{
        Node left;
        Node right;

        int data;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){

    }


    HashSet<Integer> hs = new HashSet<>();

//    public boolean findTarget(TreeNode root, int k) {
//        if(root == null) return false;
//
//        if(hs.contains(k - root.val)){
//            return true;
//        }
//
//        hs.add(root.val);
//
//        return  findTarget(root.left, k) || findTarget(root.right, k);
//    }
}
