package balancedBracket_driver;

import balancedBracket_service.BalancedBrackets;

public class Main {

	public static void main(String[] args) {
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		String bracketExpression = "([[{}]])";
		
		Boolean result;
		
		result = balancedBrackets.checkingBracketsBalanced(bracketExpression);
		
		if(result) System.out.println("The entered String has balanced brackets");
		else System.out.println("The entered String do not contain balanced brackets");
	}

}
