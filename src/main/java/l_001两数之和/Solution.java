package l_001两数之和;

import java.lang.reflect.Array;
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
