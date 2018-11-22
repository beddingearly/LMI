import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @Title: Bag
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018/11/22 11:14
 * @Description:
 */
public class Bag<Item> implements Iterable<Item>{


    public Bag(){

    }

    public void add(Item item){
    }

    public static boolean isEmpty(){
        return Boolean.parseBoolean(null);
    }

    public static int size(){
        return Integer.parseInt(null);
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class ReverseArrayIterator implements Iterable<Item>{

        @Override
        public Iterator<Item> iterator() {
            return null;
        }


    }
}

