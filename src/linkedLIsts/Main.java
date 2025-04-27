package linkedLIsts;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.contains(10)); // true if 10 exists in the list
        System.out.println(list.indexOf(10)); // 0
        System.out.println(list.size()); // returns number of items in the list

        System.out.println(list);

        // this method converts this list into an Array
        var array = list.toArray();
        System.out.println(Arrays.toString(array));// converts the items of the
        // converted array into string and prints them
    }
}
