package com.hottabych04.example;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return comprassionNodes(root.left, root.right);
    }

    private boolean comprassionNodes(TreeNode left, TreeNode right){
        if (left == null || right == null){
            if (left == right){
                return true;
            }
            return false;
        }

        if (left.val == right.val){
            if (comprassionNodes(left.left, right.right)) {
                if (comprassionNodes(left.right, right.left)){
                    return true;
                }
            }
        }

        return false;
    }
}
