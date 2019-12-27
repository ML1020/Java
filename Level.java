import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Level {
    static class ReturnValue {
        TreeNode root;
        int used;
    }

    public static ReturnValue buildTreePreorder(List<Integer> preorder){
        if (preorder.size() == 0){
           ReturnValue rv = new ReturnValue();
            rv.root = null;
            rv.used = 0;
            return rv;
        }
        int rootValue = preorder.get(0);
        if (rootValue == '#'){
            ReturnValue rv = new ReturnValue();
            rv.root = null;
            rv.used = 1;
            return rv;
        }
        ReturnValue leftRV = buildTreePreorder(
                preorder.subList(1,preorder.size()));
        ReturnValue rightRV = buildTreePreorder(
                preorder.subList(1+leftRV.used,preorder.size()));

        TreeNode root = new TreeNode();
        root.value = rootValue;
        root.left = leftRV.root;
        root.right = rightRV.root;

        ReturnValue rv = new ReturnValue();
        rv.root = root;
        rv.used = 1 + leftRV.used + rightRV.used;

        return rv;
    }

    //树的层序遍历，输出根时放入它的左右孩子<使用栈>
    public static void levelOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode front = queue.poll();//把队首元素取出
            System.out.println(front.value);
            if (front.left != null){
                queue.add(front.left);
            }
            if (front.right != null){
                queue.add(front.right);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> preorder = Arrays.asList(
                1,2,(int)'#',(int)'#',(int)'#'
        );
        ReturnValue rv = buildTreePreorder(preorder);
        levelOrderTraversal(rv.root);
    }
}
