package Trees;

public class Basic {
    class Node{
        int key;
        Node left;
        Node right;

        Node(int key){
            this.key = key;
        }
    }
    public void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.left = b;
        a.right = c;
    }
}
