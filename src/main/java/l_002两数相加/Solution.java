package l_002两数相加;

import java.util.Arrays;

/**
 * Filename:    Solution
 * Description:
 * Copyright:   Copyright (c) 2016-2017 All Rights Reserved.
 * Company:     tianli.
 *
 * @author: xufei
 * @version: 1.0
 * Create at:   2020年05月29日 18:08
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2020年05月29日 xufei     1.0         1.0 Version
 */
public class Solution {


    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     * 示例：
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-two-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */

    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));


    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }



}
