package com.org.easysolution.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        String sequence = "{{[[(())]]}}{}";

        Map bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put('}', '{');
        bracketPairs.put(']', '[');

        boolean isBalanced = checkIfBalanced(sequence, bracketPairs);
        System.out.println("check if bracket is balanced : " + isBalanced);
    }

    private static boolean checkIfBalanced(String sequence, Map<Character, Character> bracketPairs) {

        Stack bracketStore = new Stack<Character>();

        for (Character bracket : sequence.toCharArray()) {
            if (bracketStore.empty() && bracketPairs.containsKey(bracket)) {
                return false;
            } else if (bracketPairs.containsKey(bracket) && bracketPairs.get(bracket)!=(bracketStore.pop())) {
                return false;
            } else if(!bracketPairs.containsKey(bracket)) {
                bracketStore.push(bracket);
            }
        }

        if (!bracketStore.isEmpty()) {
            return false;
        }
        return true;
    }
}
