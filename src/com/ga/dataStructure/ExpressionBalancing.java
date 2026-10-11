package com.ga.dataStructure;

public class ExpressionBalancing {

    public static boolean isExpressionBalancing(String exp) {
        SingleArrayStack stack = new SingleArrayStack(exp.length());

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();

                if (ch == ')' && open != '(') {
                    return false;
                }

                if (ch == '}' && open != '{') {
                    return false;
                }

                if (ch == ']' && open != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

