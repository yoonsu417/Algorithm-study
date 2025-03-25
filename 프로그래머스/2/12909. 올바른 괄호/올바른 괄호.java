import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i<s.length(); i++) {
            Character ch = s.charAt(i);
            
            if(stack.isEmpty() && ch == ')') {
                answer = false;
            } else if(!stack.isEmpty() && ch == ')') {
                stack.pop();
            } else if(ch == '(') {
                stack.push(ch);
            }
        }
        
        if(!stack.isEmpty()) {
            answer = false;
        }
        
        return answer;
    }
}