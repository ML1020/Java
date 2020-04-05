package Important;

class NodeTree {
    int val;
    NodeTree left = null;
    NodeTree right = null;
    public NodeTree(int val) {
        this.val = val;
    }
}

public class BinaryTree {
    public static boolean isSymmetrical(NodeTree root1,NodeTree root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        //判断A的左边和B的右边是否相等，判断A的右边和B的左边是否相等，都相等就满足
        return isSymmetrical(root1.left, root2.right) && isSymmetrical(root1.right, root2.left);
    }

    public static void main(String[] args) {
        NodeTree rootA = new NodeTree(8);
        rootA.left = new NodeTree(9);
        rootA.right = new NodeTree(9);
        // rootA.left.left=new BinaryTree(9);
        // rootA.left.right=new BinaryTree(2);
        // rootA.left.right.left=new BinaryTree(4);
        // rootA.left.right.right=new BinaryTree(7);
        System.out.println(isSymmetrical(rootA, rootA));//测试
    }
}
