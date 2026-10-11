package com.ga.dataStructure;

import java.util.Stack;

import static com.ga.dataStructure.ReverseStack.reverse;

public class Exercise3 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        System.out.println("==== Stack 1 ====");
        System.out.println("Before: " + s1);
        reverse(s1);
        System.out.println("After: " + s1);

        System.out.println("==== Stack 2 ====");
        Stack<Integer> s2 = new Stack<>();
        s2.push(10);
        s2.push(20);
        s2.push(30);
        s2.push(40);
        System.out.println("Before: " + s2);
        reverse(s2);
        System.out.println("After: " + s2);

    }

}