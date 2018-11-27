/**
 * @Title: _125_Valid_Palindrome
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/11/27 10:48
 * @Description:
 */
public class _125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[ `~!@#$%^&*()+=|{}':;',\\\\[\\\\].<>/?~！@#￥%……&;*（）\"——+|{}【】‘；：”“’。，、？|-]", "").toLowerCase();
        //s = s.toLowerCase();
        StringBuffer sb = new StringBuffer(s);
        //return sb1.equals(sb.reverse());
        System.out.println(sb);
//        System.out.println(sb.reverse());
        return sb.toString().equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        _125_Valid_Palindrome a  = new _125_Valid_Palindrome();
        //String s = "race a car";
        String s = "Marge, let's \"went.\" I await news telegram.";

        System.out.println(a.isPalindrome(s));
    }
}
