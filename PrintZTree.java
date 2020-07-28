package Important;

import java.util.ArrayList;
import java.util.*;
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
*/

//请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
// 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，
// 其他行以此类推。
public class PrintZTree {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        Stack[] s = new Stack[2];
        s[0] = new Stack<TreeNode>();
        s[1] = new Stack<TreeNode>();
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        if(pRoot == null)
            return ret;
        int now = 0;
        s[now].push(pRoot);
        while(!s[0].empty() || !s[1].empty()) {
            TreeNode t = (TreeNode)s[now].pop();
            tmp.add(t.val);
            if(now == 0) {
                if(t.left != null)
                    s[1 - now].push(t.left);
                if(t.right != null)
                    s[1 - now].push(t.right);
            }
            else {
                if(t.right != null)
                    s[1 - now].push(t.right);
                if(t.left != null)
                    s[1 - now].push(t.left);
            }
            if(s[now].empty()) {
                now = 1 - now;
                ret.add(new ArrayList<Integer>(tmp));
                tmp.clear();
            }
        }
        return ret;
    }
}