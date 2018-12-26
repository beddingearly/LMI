import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

/**
 * @Title: _665_Non_decreasing_Array
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018-12-24 21:24
 * @Description:
 *         if len(nums) < 2:
 *             return True
 *         cot = 0
 *         if nums[0] > nums[1]:
 *             cot = 1
 *         length = len(nums)-1
 *         for i in range(1, length, 1):
 *             print i
 *             if cot > 1:
 *                 return False
 *             if nums[i] > nums[i+1]:
 *                 if nums[i-1] >= nums[i+1]:
 *                     index = i+1
 *                 else:
 *                     index = i
 *                 nums.pop(index)
 *                 length -= 1
 *                 i -= 1
 *                 cot += 1
 *         return True
 */
public class _665_Non_decreasing_Array {
    public boolean checkPossibility(int[] nums) {
        if(nums.length < 2){
            return true;
        }
        int cot = 0;
        int index;
        if(nums[0] > nums[1]){
            cot = 1;
        }
        int len = nums.length - 1;
        for (int i = 1; i < len; i ++){
            if (cot > 1){
                return false;
            }
            if (nums[i] > nums[i+1]){
                if(nums[i-1] >= nums[i+1]){
                    nums[i+1] = nums[i];

                }
                else {
                    nums[i] = nums[i-1];
                }
                //len--;
                //i--;
                cot++;
            }
        }
        if (cot > 1){
            return false;
        }
        return true;
    }
}
