package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR0Stack {

    // Capacitat màxima de la seqüència.
    public final int CAPACITY = 9;

    private Stack<Character> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Character>(CAPACITY);
    }


    public void fillStack() {
        for (char c = '0'; c < '9'; c++) {
            stack.push(Character.valueOf(c));
        }
    }

    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString();
    }

    public Stack<Character> getStack() {
        return this.stack;
    }
}
