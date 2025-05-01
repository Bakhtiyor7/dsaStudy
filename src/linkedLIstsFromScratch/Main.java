package linkedLIstsFromScratch;

public class Main {
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        //list.addFirst(15);
//        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(10));
        System.out.println(list.contains(5));
    }
}
