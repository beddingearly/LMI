/**
 * @Title: test
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/11/21 14:43
 * @Description:
 */

import java.awt.event.ItemEvent;
import java.util.*;

public class test {
    private void arraylist() {
        ArrayList al = new ArrayList();
        al.add(0.1);
        al.add(1);
        al.add("ac");

        Iterator iter = al.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        // index
        System.out.println(al.get(1));

        Deque<Integer> d = new Deque<>();
    }

    private void vec() {
        Vector v = new Vector();
        v.add(1);

    }

    private void hashset() {
        List<String> l = new LinkedList<>();
        //
        Iterator iter = l.iterator();
        l.add("123");
        l.add("456");

        while (iter.hasNext()){
            System.out.println(iter.next());
        }


        Set s = new HashSet();
        s.add("1");
        s.addAll(l);
        System.out.println(s);

    }

    private void hashmap() {
        Map<Integer, String> m = new HashMap();
        m.put(1, "34");
        m.put(2, "56");
        while (m.containsKey(1)) {
            System.out.println(m.values());
            break;
        }

        // 遍历
        Iterator iter = m.entrySet().iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //按key遍历
        for (int i: m.keySet()){
            System.out.println(i);
        }

        //按value遍历
        for (String s: m.values()){
            System.out.println(s);
        }

        //按key-value遍历
        for (Map.Entry<Integer, String> entry: m.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        test t = new test();

        //t.arraylist();
        //t.hashmap();
        t.hashset();

    }
}
