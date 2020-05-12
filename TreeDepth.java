package Important;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class TreeDepth {
    public static int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        int height = Math.max(left,right)+1;
        return height;
    }

    public static void levelOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode front = queue.poll();//把队首元素取出
            System.out.println(front.val);
            if (front.left != null){
                queue.add(front.left);
            }
            if (front.right != null){
                queue.add(front.right);
            }
        }
    }
}
