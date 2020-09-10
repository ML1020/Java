package Solution;

//重组二叉树
public class ReConstructBinaryTree {
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        //pre前序遍历结果、in后序遍历结果
//        if (pre.length != 0 && in.length != 0) {
//            TreeNode treenode = new TreeNode(pre[0]);
//
//            int i = 0;
//            while (pre[0] != in[i]) {
//                i++;
//            }//得到中序的根节点的下标i
//            //左右分割
//            int[] inLeft = new int[i];
//            int[] inRight = new int[in.length - i - 1];
//            for (int j = 0; j < inLeft.length; j++) {
//                inLeft[j] = in[j];
//            }
//            for (int j = 0; j < inRight.length; j++) {
//                inRight[j] = in[j + inLeft.length + 1];
//            }
//
//            int[] preLeft = new int[i];
//            int[] preRight = new int[in.length - i - 1];
//            for (int j = 0; j < preLeft.length; j++) {
//                preLeft[j] = pre[1 + j];
//            }
//            for (int j = 0; j < preRight.length; j++) {
//                preRight[j] = pre[j + preLeft.length + 1];
//            }
//            treenode.left = reConstructBinaryTree(preLeft, inLeft);
//            treenode.right = reConstructBinaryTree(preRight, inRight);
//            return treenode;
//        } else {
//            return null;
//        }

        //pre前序遍历结果、in后序遍历结果
        if (pre.length != 0 && in.length != 0) {
            TreeNode root = new TreeNode(pre[0]);
            int i = 0;
            //找到中序in的根节点的下标i
            while (in[i] != pre[0]) {
                i++;
            }
            //将中序in分割成左、右
            int[] inL = new int[i];
            int[] inR = new int[in.length - i - 1];
            //分别将值存入新的数组中
            for (int n = 0; n < inL.length; n++) {
                inL[n] = in[n];
            }
            for (int n = 0; n < inR.length; n++) {
                inR[n] = in[inL.length + n + 1];
            }
            int[] preL = new int[i];
            int[] preR = new int[in.length - i - 1];
            for (int n = 0; n < preL.length; n++) {
                preL[n] = pre[n + 1];
            }
            for (int n = 0; n < preR.length; n++) {
                preR[n] = pre[preL.length + n + 1];
            }
            root.left = reConstructBinaryTree(preL, inL);
            root.right = reConstructBinaryTree(preR, inR);
            return root;
        } else {
            return null;
        }
    }
}
