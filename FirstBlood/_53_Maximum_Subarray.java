/**
 * @Title: _53_Maximum_Subarray
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018-12-26 11:14
 * @Description:
 */
import java.util.*;
public class _53_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int [] n = new int[nums.length];
        n[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            n[i] = nums[i] + nums[i-1] < nums[i]? nums[i]: nums[i] + nums[i-1];
        }
        int max = n[0];
        for (int i = 1; i < n.length; i++){
            max = n[i] > max? n[i]: max;
        }
        for(int i: nums){
            System.out.println(i);
        }
        System.out.println(nums);
        return max;
    }
}
