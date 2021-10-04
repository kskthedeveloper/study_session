import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfString {
    private String[] entries;
    private int size;
    private int capacity;

    public FixedCapacityStackOfString(int capacity) {
        this.entries = new String[capacity];
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(String item) {
        if(size < capacity) {
            entries[size++] = item;
        }
    }

    public String pop() {
        return entries[--size];
    }
}

class StackClient {
    public static void main(String[] args) {
        FixedCapacityStackOfString stack = new FixedCapacityStackOfString(5);

        stack.push("one");
        stack.push("two");
        StdOut.print(stack.size());

        stack.push("three");
        stack.push("four");
        stack.push("five");
        StdOut.print(stack.size());

        stack.push("six"); // error
        StdOut.print(stack.size());

        stack.pop();
        stack.pop();
        stack.pop();
        StdOut.print(stack.size());

        stack.pop();
        stack.pop();
        StdOut.print(stack.size());
    }
}
