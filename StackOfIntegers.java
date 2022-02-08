package Week4;

public class StackOfIntegers {
    
    private int elements[] = new int[0];
    private int size = this.elements.length;

    public StackOfIntegers() {
        this.elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }

    public boolean empty() {
        if (this.size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int peek() {
        return this.elements[this.size - 1];
    }

    public void push(int value) {
        this.elements[this.size] = value;
        this.size += 1;
    }

    public int pop() {
        int thepop = this.elements[this.size - 1];
        this.size -= 1;
        return thepop;
    }

    public int getSize() {
        return this.size;
    }

}
