package BST;
import java.util.*;

public class TopViewBST {
    public static void main(String[] args){

    }

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
    ArrayList<Integer> topView(Node root)
    {
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair p = q.poll();
            Node curr = p.root;
            int hd = p.hd;

            if(tm.containsKey(hd)){
                tm.get(hd).add(curr.data);
            }
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(curr.data);
                tm.put(hd, temp);
            }

            if(curr.left != null) q.add(new Pair(curr.left, hd-1));
            if(curr.right != null) q.add(new Pair(curr.right, hd+1));
        }

        ArrayList<Integer> al = new ArrayList<>();

        for(Map.Entry<Integer, ArrayList<Integer>> item: tm.entrySet()){
            int res = item.getValue().get(0);

            al.add(res);
        }

        return al;
    }
}
