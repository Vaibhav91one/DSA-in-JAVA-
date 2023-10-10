package BST;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class VerticalSum {
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

    public static ArrayList <Integer> verticalSum(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        helper(root, 0, tm);

        for(Map.Entry<Integer, Integer> item: tm.entrySet()){
            al.add(item.getValue());
        }

        return al;
    }
    public static void helper(Node root, int hd, TreeMap<Integer, Integer> tm){
        if(root == null) return;

        helper(root.left, hd-1, tm);

        if(tm.containsKey(hd)){
            tm.put(hd, tm.get(hd) + root.data);
        }
        else{
            tm.put(hd, root.data);
        }

        helper(root.right, hd+1, tm);
    }
}
