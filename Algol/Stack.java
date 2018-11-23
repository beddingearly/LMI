import java.util.Iterator;
import java.util.ListIterator;

/**
 * @Title: Stack
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/11/23 15:35
 * @Description: 链栈的实现
 * 压栈即链在头部，从头部弹栈顶
 */
public class Stack<Item> implements Iterable<Item> {
    private Node first;
    private int N = 0;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        N++;
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public Item pop() {
        if (N == 0) {
            return null;
        } else {
            N--;
            Item oldFirstItem = first.item;
            first = first.next;
            return oldFirstItem;
        }

    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {

        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        StdOut.println(stack.N);
//        StdOut.println(stack.pop());
//        StdOut.println(stack.size());
//        Iterator<Integer> iter = stack.iterator();
//        StdOut.println(iter.next());
    }
}
