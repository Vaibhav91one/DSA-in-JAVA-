package BST;

public class Ciel {
    class Node{
        Node left;
        Node right;

        int data;
        Node(int val){
            this.data = val;
        }
    }
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        Node res = null;

        while(root != null){

            if(root.data == key){
                return root.data;
            }

            //going to right side for greater element
            if(root.data < key){
                root = root.right;
            }

            //going to left side because we found a potential element that can be ceil and storing it in res;
            else{
                res = root;
                root = root.left;
            }
        }

        if(res == null) return -1;
        return res.data;
    }
}
