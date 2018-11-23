import java.util.Iterator;
import java.util.ListIterator;

/**
 * @Title: Queue
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/11/23 16:33
 * @Description: 队列是从头出队，从尾入队
 */
public class Queue<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N = 0;

    private class Node {

        Item item;
        Node next;

        public Node(Item value) {
            item = value;
        }

    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        // 从屁股插。。
        Node newlast = new Node(item);
        last.next = newlast;
        last = newlast;
        last.next = null;
        N++;
        if (isEmpty()) {
            first = last;
        }

    }

    public Item dequeue() {
        // 出头
        if (N == 0) {
            return null;
        }
        Item item = first.item;
        N--;
        first = first.next;
        return item;
    }


    public Iterator<Item> iterator() {
        return new ListIterator<Item>();
    }

    private class ListIterator<Item> implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {

        }

        public Item next() {
            Item item = (Item) current.item;
            current = current.next;
            return item;
        }
    }
    //pscm
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        StdOut.println(s.pop());
        StdOut.println(s.pop());
    }

}
