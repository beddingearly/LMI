import java.util.ArrayList;

/**
 * @Title: _443_String_Compression
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/11/30 20:29
 * @Description:
 * 判断是不是和前一个相同
 * 不是：写入count和下一个char
 * 是：count++和判断是否是最后一个（写入count）
 *
 */
public class _443_String_Compression {
    public int compress(char[] chars) {
        char base = chars[0];
        int count = 1;
        int pos = 0;
        for (int i = 1; i < chars.length; i++){
            if (base != chars[i]){
                base = chars[i];
                if (count == 1){//前一个char的数目
                    chars[++pos] = base;
                    continue;
                }
                // 先计数再写入下一个值
                else
                    for (int j = 0; j < String.valueOf(count).length(); j++){
                        chars[++pos] = String.valueOf(count).charAt(j);
                    }
                //下一个char
                count = 1;
                chars[++pos] = base;
            }
            else {// base == chars[i]
                count ++;
                if (i == chars.length-1){
                    if (count == 1){
                        continue;
                    }
                    for (int j = 0; j < String.valueOf(count).length(); j++){
                        chars[++pos] = String.valueOf(count).charAt(j);
                    }

                }

            }

        }
        ++pos;
        splitArray(chars, pos);
        if (pos == 0)
            return 1;
        return pos;
    }

    private void splitArray(char[] chars, int index){
        char [] a = new char[index];
        for (int i = 0; i < index; i++){
            a[i] = chars[i];
        }
        for(char i: a)
            System.out.println(i);
        System.out.println();
    }

    public static void main(String[] args) {
        char [] b = {'a','b','b','c','c','c','c','c','a','a'};
        _443_String_Compression bb = new _443_String_Compression();
        System.out.println(bb.compress(b));

    }
}
