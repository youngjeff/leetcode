package ValidateBinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
}
class TreeNode {
   int val;
   TreeNode left;
     TreeNode right;
    TreeNode(int x) { val = x; }
}
 class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}