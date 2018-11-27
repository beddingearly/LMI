import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Title: _151_Reverse_Words_in_a_String
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/11/27 14:16
 * @Description:
 */
public class _151_Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        s = s.trim();
        System.out.println(s);
        if (s.equals("")){
            return "";
        }
        ArrayList<String> ss = new ArrayList(Arrays.asList(s.split(" ")));
        int len = ss.size();
        for (int i = 0; i < len; i++) {
            if (ss.get(i).equals("")) {
                ss.remove(i);
                i--;
                len--;
            }
        }
        Collections.reverse(ss);
        String result = "";
        for (String i : ss) {
            result = result + i + " ";
        }
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        _151_Reverse_Words_in_a_String a = new _151_Reverse_Words_in_a_String();
        String s = "   a   b ";
        System.out.println(a.reverseWords(s));
    }
}
