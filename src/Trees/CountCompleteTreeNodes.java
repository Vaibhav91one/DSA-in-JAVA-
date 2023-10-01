package Trees;

public class CountCompleteTreeNodes {
    public static void main(String[] args){

    }

    public int countNodes(Node root) {
        int lh = 0, rh = 0;

        Node curr = root;

        while(curr != null){
            lh++;
            curr = curr.left;
        }

        curr = root;

        while(curr != null){
            lh++;
            curr = curr.right;
        }


        if(lh == rh){
            return (int) (Math.pow(2, lh) - 1);
        }

        else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }
}
