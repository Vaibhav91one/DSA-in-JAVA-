package BST;
import java.util.*;

public class VerticalTraversalBinaryTree {
    class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    class Pair{
        Node root;
        int hd;

        Pair(Node root, int hd){
            this.root = root;
            this.hd = hd;
        }
    }

    ArrayList <Integer> verticalOrder(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
//        Using Queue for level order traversal
        Queue<Pair> q = new LinkedList<>();
        //Using treeMap for storing the items as it stores the items in sorted order
        TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();

        //adding a pair of node and its horizontal distance
        q.add(new Pair(root, 0));

        //doing level order traversal
        while(!q.isEmpty()){

            // using the root element
            Pair p = q.poll();
            Node curr = p.root;
            int hd = p.hd;

            // if the horizontal distance is already present we just add the root element
            if(tm.containsKey(hd)){
                tm.get(hd).add(curr.data);
            }
            //else we create a new arraylist and add it to the treemap
            else{
                ArrayList<Integer> al = new ArrayList<>();
                al.add(curr.data);
                tm.put(hd,al);
            }

            // adding the left and right elements of the curr node
            if(curr.left != null) q.add(new Pair(curr.left, hd-1));
            if(curr.right != null) q.add(new Pair(curr.right, hd+1));
        }

        //Adding the elements to Arraylist

        for(Map.Entry<Integer, ArrayList<Integer>> item : tm.entrySet()){
            ArrayList<Integer> res = item.getValue();

            result.addAll(res);
        }

        return result;
    }

}
