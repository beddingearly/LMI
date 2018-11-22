import com.sun.jdi.Value;
import org.w3c.dom.Node;

import java.awt.*;
import java.sql.SQLOutput;

/**
 * @Title: BST
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/11/22 09:10
 * @Description:
 */
public class BST<key extends Comparable<key>, value> {
    private Node root;

    private class Node {
        private Key key;
        private Value value;
        private Node left, right;
        private int N;

        public Node(Key key, Value value, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
        }
    }

    public int size() {
        return size(this.root);
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        } else
            return x.N;
    }

    private class Key {
        public int key;

        public int compareTo(Key target) {
            if (this.key < target.key) {
                return 1;
            } else if (this.key > target.key) {
                return -1;
            } else {
                return 0;
            }
        }

    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        } else {
            return x.value;
        }
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null) {
            return new Node(key, value, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else {
            x.value = value;
        }
        x.N = size(x.left) + size(x.right) + 1;
        return x;
        //StdOut.printf();
    }
    public static void main(String [] avgs){
        StdOut.printf("Hello BST");
    }
}
