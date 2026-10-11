package com.ga.dataStructure;

import java.util.Stack;

public class ReverseStack {

    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, item);
        stack.push(temp);
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();
        reverse(stack);
        insertAtBottom(stack, temp);
    }
}