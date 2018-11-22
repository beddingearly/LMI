import com.sun.tools.javac.Main;

import java.util.Iterator;

/**
 * @Title: ResizingArrayStack
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/11/22 14:47
 * @Description: 下压栈，能够动态调整数组的大小
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    // 把栈移动到一个大小为max的新数组
    private void resize(int max, int old) {
        Item[] nstack = (Item[]) new Object[max];

        for (int i = 0; i < old; i++) {
            nstack[i] = a[i];
        }
        a = nstack;// a指向新数组的地址
    }

    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0) {
            resize(N, N);
        }
        return item;
    }

    public void push(Item item) {
        if (N == a.length) {
            resize(a.length + 1, N);
        }
        a[N++] = item;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return a[--i];
        }

        public void remove() {

        }

    }

    public void traverse() {
        for (Item i : a) {
            System.out.println(i);
        }
    }

    public ResizingArrayStack() {
    }

    public static void main(String[] args) {
        ResizingArrayStack<Integer> a = new ResizingArrayStack<>();
        a.push(1);
        a.push(3);
        a.push(2);
        StdOut.println(a.pop());
        StdOut.println(a.size());
//        for(int j: a){
//            System.out.println(j);
//        }
        StdOut.println(a.pop());
        StdOut.println(a.size());
    }
}
