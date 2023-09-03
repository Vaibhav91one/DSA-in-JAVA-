package GFGPOTD;
import java.util.Queue;
import java.util.LinkedList;
public class Sep2LeafUnderBudget {
    class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }
    public int getCount(Node node, int bud)
    {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(node,1)); //adding root
        int count = 0; //no of leaves visited
        int sum = 0;// cost of leaves visited

        while (q.size() > 0) {
            Node temp = q.peek().a;
            int  lvl = q.peek().b;
            q.remove();
            if(temp.left == null && temp.right == null){
                count++;
                sum = sum + lvl;
                if(sum >bud) return count - 1;
                if(sum == bud) return count;
            }
            //adding left and right and in level wise order
            if(temp.left != null) q.add(new Pair(temp.left, lvl + 1));
            if(temp.right != null) q.add(new Pair(temp.right, lvl + 1));
        }
        return count;
    }

    class Pair{
        Node a;
        int b;
        Pair(Node a, int b){
            this.a = a;
            this.b = b;
        }
    }
}
