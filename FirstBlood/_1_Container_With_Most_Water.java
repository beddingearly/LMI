/**
 * @Title: _1_Container_With_Most_Water
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/11/27 10:33
 * @Description:
 */
public class _1_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int s = (r-l) * (height[l] > height[r]? height[r]: height[l]);
        while (l < r){
            if (height[l] < height[r]){
                l++;
            }
            else {
                r--;
            }
            s = Math.max(s, (r-l) * (height[l] > height[r]? height[r]: height[l]));
        }
        return s;

    }
}
