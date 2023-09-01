package BinaryTree;
import java.util.Queue;
import java.util.LinkedList;
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
public class LeftmostRightmost {

    public static void printCorner(Node node)
    {
     Queue<Node> q = new LinkedList<>();
     q.add(node);

     while(q.size() > 0){
         int n = q.size();
         for(int i = 0; i < n; i++){
             Node curr = q.poll();
             if(i ==0 || i == n - 1){
                 System.out.print(curr.data + " ");
             }
             if(curr.left != null) q.add(curr.left);
             if(curr.right != null) q.add(curr.right);
         }
     }
    }
}
