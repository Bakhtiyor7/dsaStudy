package linkedLIstsFromScratch;

class LinkedLists {
   private class Node {
       private int value;
       private Node next;

       public Node(int value) {
           this.value = value;
       }
   }

   private Node first;
   private Node last;

   public void addLast(int item) {
       var node = new Node(item);

       if(isEmpty())
           first = last = node;
       else {
           last.next = node;
           last = node;
       }
   }

   public void addFirst(int item) {
       var node = new Node(item);

       if (isEmpty())
           first = last = node;
       else {
           last.next = first;
           first = node;
       }
   }

   private boolean isEmpty() {
       return first == null;
   }

   public int indexOf(int item) {
       int index = 0;
       var current = first;

       while (current != null) {
           if (current.value == item) return index;
           current = current.next;
           index++;
       }
       return -1;
   }

   // we don't need to create a new logic because we already
    // created this logic in indexOf. so we can just re-use indexOf
   public boolean contains (int item) {
       return indexOf(item) != -1;
   }
}