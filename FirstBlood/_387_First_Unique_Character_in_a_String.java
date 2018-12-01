import java.util.HashMap;
import java.util.Map;

/**
 * @Title: _387_First_Unique_Character_in_a_String
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/12/1 08:13
 * @Description:
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 *
 *
 *
 * 注意事项：您可以假定该字符串只包含小写字母。
 */
public class _387_First_Unique_Character_in_a_String {
//    public int firstUniqChar(String s) {
//        for (int i = 0; i < s.length(); i++){
//            //充分利用返回第一次遇到元素的索引来创建子串
//            if (s.substring(s.indexOf(s.charAt(i))+1).contains(s.substring(i, i+1))){
//                continue;
//            }
//            else {
//                return i;
//            }
//        }
//        return -1;
//    }
    public int firstUniqChar(String s) {
        //char[] c = s.toCharArray();
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (m.containsKey(s.charAt(i))){
                m.put(s.charAt(i), m.get(s.charAt(i))+1);
            }
            else {
                m.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++){
            if (m.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _387_First_Unique_Character_in_a_String a = new _387_First_Unique_Character_in_a_String();
        String aa = "leetcode";
        System.out.println(a.firstUniqChar(aa));
        System.out.println(('c'-'a'));
    }
}
