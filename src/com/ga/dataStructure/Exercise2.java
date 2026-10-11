package com.ga.dataStructure;

import static com.ga.dataStructure.ExpressionBalancing.isExpressionBalancing;

public class Exercise2 {
    public static void main(String[] args) {
        String exp1 = "]]]])}";
        String exp2 = "{[()]}";
        String exp3 = "((()}]{}";
        String exp4 = "())[][]))";

        System.out.println(exp1 + " : " + isExpressionBalancing(exp1));
        System.out.println(exp2 + " : " + isExpressionBalancing(exp2));
        System.out.println(exp3 + " : " + isExpressionBalancing(exp3));
        System.out.println(exp4 + " : " + isExpressionBalancing(exp4));
    }
}