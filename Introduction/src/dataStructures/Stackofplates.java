package dataStructures;

// Soln:
// This problem isn't that bad if we just draw it out.
// We basically need a collection of Stacks (which we can track in an ArrayList).
// And whenever we exceed our threshold, we insert a new Stack.
// And whenever we fall beneath it, we remove the old Stack.

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class Stackofplates {

    private int THRESHOLD = 3;
    private ArrayList<Stack> stacks;

    public Stackofplates(int THRESHOLD) {
        this.THRESHOLD = THRESHOLD;
        stacks = new ArrayList<Stack>();
        Stack stack = new Stack();
        stacks.add(stack);
    }

    public void push(int data) {
        Stack current = getCurrentStack();
        if (current != null && current.size() < this.THRESHOLD) {
            current.add(data);
        } else {
            Stack newStack = new Stack();
            newStack.add(data);
            stacks.add(newStack);
        }
    }

    public int pop() {
        Stack current = getCurrentStack();
        if (current == null) throw new EmptyStackException();
        int data = (Integer) current.pop();

        if (current.size() == 0) {
            stacks.remove(stacks.size() - 1);
        }

        return data;
    }

    public Stack getCurrentStack() {
        return stacks.get(stacks.size() - 1);
    }

}
