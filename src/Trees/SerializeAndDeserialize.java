package Trees;
import java.util.ArrayList;
public class SerializeAndDeserialize {
    public static void main(String[] args){

    }

    int Empty = -1;
    // doing pre order traversal
    public void serialize(Node root, ArrayList<Integer> A)
    {
        if(root == null){
            A.add(Empty);
            return;
        }

        A.add(root.data);
        serialize(root.left, A);
        serialize(root.right, A);
    }

    //Function to deserialize a list and construct the tree.
    //decoding pre-order traversal
    int index = 0;
    public Node deSerialize(ArrayList<Integer> A)
    {
        if(index == A.size()) return null;

        int val = A.get(index);
        index++;

        if(val == Empty) return null;

        Node root = new Node(val);

        root.left = deSerialize(A);
        root.right = deSerialize(A);
        return root;
    }

//    leetcode
//    public void preorder(TreeNode root, char ch, char empty, StringBuilder sb) {
//        if (root == null) {
//            sb.append(empty);
//            sb.append(ch);
//            return;
//        }
//        sb.append(root.val);
//        sb.append(ch);
//        preorder(root.left, ch, empty, sb);
//        preorder(root.right, ch, empty, sb);
//    }
//
//    public String serialize(TreeNode root) {
//        char ch = '/';
//        char empty = 'n';
//        StringBuilder sb = new StringBuilder();
//        preorder(root, ch, empty, sb);
//        return sb.toString();
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserializeHelper(String preorder[], int index[], int end) {
//        if (index[0] > end) return null;
//        if (preorder[index[0]].equals("n")) {
//            index[0] = index[0] + 1;
//            return null;
//        }
//        int val = Integer.parseInt(preorder[index[0]]);
//        index[0] = index[0] + 1;
//        TreeNode root = new TreeNode(val);
//
//        root.left = deserializeHelper(preorder, index, end);
//
//        root.right = deserializeHelper(preorder, index, end);
//        return root;
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        String preorder[] = data.split("/");
//        TreeNode ans = deserializeHelper(preorder, new int[1], preorder.length - 1);
//        return ans;
//    }
}
