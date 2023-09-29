package Trees;

import java.util.ArrayList;

public class LowestCommonAncestor {
    public static void main(String[] args){

    }

     boolean findPath(Node root, ArrayList<Node> p, int  n){
        //if the root is null we return
       if(root == null) return false;
        p.add(root);

        // if the root value is what we want that is n we return true and keep the root in the p
       if(root.data == n) {
           return true;
       }

       // we check both left and right subtrees for the element
       if((findPath(root.left, p, n)) || (findPath(root.right, p, n))){
           return true;
       }

       // we will reach this part when we do not find the element we that is n in any subtree.
        // we remove the added element
       p.remove(p.size()-1);

        return false;
    }

    Node lca(Node root, int n1,int n2)
    {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        findPath(root, path1, n1);
        findPath(root, path2, n2);

        int i = 0;
        while(i < path1.size() && i < path2.size() && path1.get(i) == path2.get(i)){
           i++;
        }

        return path1.get(i-1);
    }
}
