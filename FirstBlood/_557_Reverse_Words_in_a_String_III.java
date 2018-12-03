/**
 * @Title: _557_Reverse_Words_in_a_String_III
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/12/1 18:46
 * @Description:
 */
public class _557_Reverse_Words_in_a_String_III {
    public String reverseWords(String s) {
        String [] a = s.split(" ");
        String ss = "";
        for (int i = 0; i < a.length; i++){
            StringBuffer sb = new StringBuffer(a[i]);
            ss = ss + sb.reverse().toString() + " ";
        }
        return ss.substring(0, ss.length()-1);

    }
}
