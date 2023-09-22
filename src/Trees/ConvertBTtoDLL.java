package Trees;

public class ConvertBTtoDLL {

    Node prev = null;
    Node bToDLL(Node root)
    {
//        base case if root is null
        if(root == null) return root;

        // we do inorder traversal Left subtree, root, right subtree
        Node head = bToDLL(root.left);

        // if the node is the first node we make it head
        if(prev == null){
            head = root;
        }
        // else we make the left item as prev node and right node as next node
        else{
            root.left = prev;
            prev.right = root;
        }

        //maintaining prev node
        prev = root;

//        now traversing the right subtree
        bToDLL(root.right);

        return head;
    }
}
