package Trees;

public class ChildrenSum {
    public static void main(String[] args){

    }

    public static int isSumProperty(Node root)
    {
        if(root == null) return 1;
        if(root.left == null && root.right == null) return 1;

        int sum = 0;

        if(root.left != null) sum+= root.left.data;
        if(root.right != null) sum+= root.right.data;

        if(root.data == sum){
            if(isSumProperty(root.left) == 1 && isSumProperty(root.right) == 1){
                return 1;
            };
        }
        return 0;
    }
}
