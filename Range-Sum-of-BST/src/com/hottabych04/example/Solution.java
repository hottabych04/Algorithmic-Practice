package com.hottabych04.example;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        if (root != null){
            if (root.val < low){
                sum += rangeSumBST(root.right, low, high);
            } else if (root.val > high){
                sum += rangeSumBST(root.left, low, high);
            } else {
                sum += root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
            }
        }

        return sum;
    }
}
