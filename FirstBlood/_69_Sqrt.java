/**
 * @Title: _69_Sqrt
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018-12-29 20:09
 * @Description:
 */
public class _69_Sqrt {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int low = 0;
        int high = x/2 + 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (mid < x/mid){
                low = mid + 1;
            }
            else if (mid> x/mid){
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return low-1;
    }
}
