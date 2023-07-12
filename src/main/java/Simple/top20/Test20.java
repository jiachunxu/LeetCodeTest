package com0020j;

import java.util.Stack;

/**
 * @author JCX
 * 时间: 2021/10/3 - 10 - 03 - 17:04
 * <p>
 * 简单: 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class Test20 {
    public static void main(String[] args) {
        //s = "()"
        //s = "()[]{}"
        //s = "(]"
        //s = "([)]"
        //"([)]"
        //"{[]}"
        //"(){}}{"
        String s = "(){}}{";

        Solution ss = new Solution();
        System.out.println(ss.isValid(s));

    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> characters;
        try {
            if (s.length() % 2 != 0) {
                return false;
            }
            characters = new Stack<>();
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '[') {
                    characters.push(']');

                } else if (s.charAt(i) == '(') {
                    characters.push(')');
                } else if (s.charAt(i) == '{') {
                    characters.push('}');
                } /*else if (s.charAt(i) == ')') {
                    Character pop = characters.pop();
                    boolean equals = pop.equals(s.charAt(i));
                    if (!equals) {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    Character pop = characters.pop();
                    boolean equals = pop.equals(s.charAt(i));
                    if (!equals) {
                        return false;
                    }

                } else if (s.charAt(i) == ']') {
                    Character pop = characters.pop();
                    boolean equals = pop.equals(s.charAt(i));
                    if (!equals) {
                        return false;
                    }
                }*/ else if (!characters.pop().equals(s.charAt(i))) {
                    return false;
                }

            }
        } catch (Exception e) {
            return false;
        }
        return characters.isEmpty();
    }
}