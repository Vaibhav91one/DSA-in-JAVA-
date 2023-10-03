package BST;


public class Floor {
    class Node{
        Node left;
        Node right;

        int data;
        Node(int val){
            this.data = val;
        }
    }
    public static int floor(Node root, int x) {
        Node res = null;

        while(root != null){

            if(root.data == x){
                return root.data;
            }

            //going to left side for smaller element
            if(root.data > x){
                root = root.left;
            }

            //going to right side because we found a potential element that can be floor and storing it in res;
            else{
                res = root;
                root = root.right;
            }
        }

        if(res == null) return -1;
        return res.data;
    }
}
