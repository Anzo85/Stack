package org.anzo.stack;

import java.util.*;

public class StringCheck {


    public boolean isVailid(String string) {


        String open = "([{";
        String close = ")]}";
        Stack<Character> stack = new Stack();

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < open.length(); j++) {
                if (string.charAt(i) == open.charAt(j)) {
                    stack.push(open.charAt(j));
                }
            }

            for (int j = 0; j < close.length(); j++) {
                if (string.charAt(i) == close.charAt(j)) {
                    if (!stack.isEmpty()) {
                        if ((stack.peek() != '(')
                                && (stack.peek() ==
                                (close.charAt(j) - 2))) {
                            stack.pop();
                        } else if (stack.peek() == (Object) '(' && close.charAt(j) == ')') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        if (stack.isEmpty())
            return true;
        else {

            return false;
        }
    }


}

