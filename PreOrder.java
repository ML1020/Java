package TreeAbout;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int value;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode(int value){
        this.value = value;
    }
}

public class PreOrder {
    //前序递归   &   中序遍历   &   后序遍历
    public static List<Integer> list;
    private static void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        list.add(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static List<Integer> preOrderTraversal(TreeNode root){
        list = new ArrayList<>();
        preOrder(root);
        return list;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        n1.left = new TreeNode(2);
        n1.right = new TreeNode(3);
        n1.left.left = new TreeNode(4);
        n1.left.right = new TreeNode(5);
        n1.right.right = new TreeNode(6);
        List<Integer> list = preOrderTraversal(n1);
//      preOrderTraversal(n1);
        System.out.println("========");
        System.out.println(list);
        System.out.println("========");
//      preOrder(n1);
    }
}
