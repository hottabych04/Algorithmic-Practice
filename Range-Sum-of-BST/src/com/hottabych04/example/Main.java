package com.hottabych04.example;

import java.util.Scanner;

public class Main {
    private final static Solution solution = new Solution();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int[] nums = parseStringToIntArray(line);
        String low = scanner.nextLine();
        String high = scanner.nextLine();
        TreeNode tree = new TreeNode(nums[0]);
        fillingNodes(tree, nums, 1);

        System.out.println(solution.rangeSumBST(tree, Integer.parseInt(low), Integer.parseInt(high)));
    }

    public static int[] parseStringToIntArray(String input) {
        String[] stringNumbers = input.replaceAll("null", "101").replaceAll("\\[|\\]|\\s", "").split(",");

        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        return numbers;
    }

    private static void fillingNodes(TreeNode node, int[] nums, int index){
        if (index >= nums.length) return;
        if (nums[index] == 101){
            node.left = null;
        } else {
            node.left = new TreeNode(nums[index]);
            fillingNodes(node.left, nums, (index*2)+1);
        }

        index++;

        if (index >= nums.length) return;
        if (nums[index] == 101){
            node.right = null;
        } else {
            node.right = new TreeNode(nums[index]);
            fillingNodes(node.right, nums, (index*2)+1);
        }
    }
}
