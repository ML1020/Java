package Important;

import java.util.*;
//请实现两个函数，分别用来序列化和反序列化二叉树
//二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，
// 从而使得内存中建立起来的二叉树可以持久保存。
// 序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，
// 序列化的结果是一个字符串，序列化时通过 某种符号表示空节点（#），
// 以 ！ 表示一个结点值的结束（value!）。
//
//二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
//
//例如，我们可以把一个只有根节点为1的二叉树序列化为"1,"，
// 然后通过自己的函数来解析回这个二叉树

//采用层序遍历，不需要将转化为完全二叉树的简单方法
public class Serialize {
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root != null)
            queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null){
                queue.offer(node.left);
                queue.offer(node.right);
                sb.append(node.val + ",");
            }else{
                sb.append("#" + ",");
            }
        }
        if(sb.length() != 0)
            sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        TreeNode head = null;
        if(str == null || str.length() == 0)
            return head;
        String[] nodes = str.split(",");
        TreeNode[] treeNodes = new TreeNode[nodes.length];
        for(int i=0; i<nodes.length; i++){
            if(!nodes[i].equals("#"))
                treeNodes[i] = new TreeNode(Integer.valueOf(nodes[i]));
        }
        for(int i=0, j=1; j<treeNodes.length; i++){
            if(treeNodes[i] != null){
                treeNodes[i].left = treeNodes[j++];
                treeNodes[i].right = treeNodes[j++];
            }
        }
        return treeNodes[0];
    }
}

//前序遍历
//public class Serialize1 {
//    String Serialize(TreeNode root) {
//        StringBuilder sb = new StringBuilder();
//        getSerializeString(root, sb);
//        if(sb.length() != 0)
//            sb.deleteCharAt(sb.length()-1);
//        return sb.toString();
//    }
//    getSerializeString(TreeNode root, StringBuilder sb){
//        if(root == null)
//            sb.append("#,");
//        else{
//            sb.append(root.val + ",");
//            getSerializeString(root.left, sb);
//            getSerializeString(root.right, sb);
//        }
//    }
//    TreeNode Deserialize(String str) {
//        if(str == null || str.length() == 0 || str.length() ==1)
//            return null;
//        String[] nodes = str.split(",");
//        TreeNode[] treeNodes = new TreeNode[nodes.length];
//        for(int i=0; i<nodes.length; i++){
//            if(!nodes[i].equals("#"))
//                treeNodes[i] = new TreeNode(Integer.valueOf(nodes[i]));
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(treeNodes[0]);
//        int i = 1;
//        while(treeNodes[i] != null){
//            stack.peek().left = treeNodes[i];
//            stack.push(treeNodes[i++]);
//        }
//        while(!stack.isEmpty()){
//            stack.pop().right = treeNodes[++i];
//            if(treeNodes[i] != null){
//                stack.push(treeNodes[i++]);
//                while(treeNodes[i] != null){
//                    stack.peek().left = treeNodes[i];
//                    stack.push(treeNodes[i++]);
//                }
//            }
//        }
//        return treeNodes[0];
//    }
//}