/**
 * @Title: _215_Kth_Largest_Element_in_an_Array
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/12/14 10:29
 * @Description:
 */
import java.util.Arrays;
import java.util.Collections;
public class _215_Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        // 经过调优的快速排序法
        Arrays.sort(nums);
        return nums[nums.length-k-1];
    }

    public static void main(String[] args) {
        _215_Kth_Largest_Element_in_an_Array a = new _215_Kth_Largest_Element_in_an_Array();
        int [] aa = {3,2,3,1,2,4,5,5,6};
        System.out.println(a.findKthLargest(aa, 3));
    }
}
