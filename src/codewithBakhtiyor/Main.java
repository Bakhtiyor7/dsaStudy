package codewithBakhtiyor;

public class Main {
    public static void main(String[] args) {
        Array numbers =  new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
//        numbers.removeAt(1);
        System.out.println(numbers.indexOf(30));
        numbers.print();
    }
}
