package balancedBracket_service;

import java.util.Stack;

public class BalancedBrackets {
	
	public Boolean checkingBracketsBalanced(String string) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < string.length(); i++) {
			char character = string.charAt(i);
			
			if(character == '(' || character == '[' || character == '{') {
				stack.push(character);
				continue;
			}
			
			if(stack.isEmpty()) {
				return false;
			}
			
			char c;
			
			switch (character) {
			
			case '}':
				c = stack.pop(); // c = {
				if(c == '(' || c == '[') return false;
				break;
				
			case ')':
				c = stack.pop();
				if(c == '{' || c == '[') return false;
				break;
				
			case ']':
				c = stack.pop();
				if(c == '{' || c == '(') return false;
				break;
				
			}
		}
		return (stack.isEmpty());
	}
}
