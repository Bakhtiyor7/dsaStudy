package codewithBakhtiyor;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert (int item) {

        // if the array is full creates a new array and copies all the elements to the new array
    if (items.length == count) {
        int[] newItems = new int[count * 2];

        for (int i = 0; i < count; i++)
            newItems[i] = items[i];

        items = newItems;

    }

    items[count++] = item;
    }

    // removeAt

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IndexOutOfBoundsException("Error: index out of bounds");

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        // shrink the array because after moving the items one step backwards there will empty element
        count--;
    }
}
