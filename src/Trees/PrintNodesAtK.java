package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintNodesAtK {

    static ArrayList<Integer> al = new ArrayList<>();
    public static void KdistanceRecursive(Node root, int k){
        if(root == null){
            return;
        }
        if(k == 0){
            al.add(root.data);
        }

        else{
            KdistanceRecursive(root.left, k - 1);
            KdistanceRecursive(root.right, k - 1);
        }
    }
}
