/**
 * @Title: _80_Remove_Duplicates_from_Sorted_Array_II
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/11/25 11:50
 * @Description:
 */
import java.util.*;
public class _80_Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3){
            return nums.length;
        }
        int pos = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i]!=nums[pos-2])
                nums[pos++]=nums[i];
        }
        return pos;
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(0.1);
        al.add(1);
        al.add("ac");


    }
}
