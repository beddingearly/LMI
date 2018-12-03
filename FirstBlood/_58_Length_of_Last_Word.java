/**
 * @Title: _58_Length_of_Last_Word
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/12/2 23:59
 * @Description:
 */
public class _58_Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        String [] ss = s.trim().split(" ");
        return ss[ss.length-1].length();
    }

    public static void main(String[] args) {
        _58_Length_of_Last_Word a = new _58_Length_of_Last_Word();
        System.out.println(a.lengthOfLastWord("a b  "));
    }

}
