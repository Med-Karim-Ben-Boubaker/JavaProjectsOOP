package JavaProjects.TP1.Exercice2;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {

    /*
    The Calculate methode will take an infix string, convert it to a postfix expression by convertInfixToPostfix(),
    and then evaluate the postfix expression via evaluatePostfix().It is far more effective to change the expression
    to postfix (or prefix) form before evaluation since computers struggle to distinguish between operators and parentheses.
    */
    public int Calculate(String inputText){
        return  evaluatePostfix(convertInfixToPostfix(inputText));
        
    }

    //This methode checks the precedence of the operations
    public int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
    
    
    public String convertInfixToPostfix(String exp)
    {
        // initializing empty String for result
        String result = new String("");
  
        // initializing empty stack
        Deque<Character> stack
            = new ArrayDeque<Character>();
  
        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
  
            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
  
            // If the scanned character is an '(',
            // push it to the stack.
            else if (c == '(')
                stack.push(c);
  
            //  If the scanned character is an ')',
            // pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty()
                       && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
  
                stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty()
                       && precedence(c) <= precedence(stack.peek())) {
  
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
  
        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
        
        return result;
    }
    
    
    public int evaluatePostfix(String exp)
	{
		//create a stack
		Stack<Integer> stack=new Stack<>();
		
		// Scan all characters one by one
		for(int i=0;i<exp.length();i++)
		{
			char c=exp.charAt(i);
			
			// If the scanned character is an operand (number here),
			// push it to the stack.
			if(Character.isDigit(c))
			stack.push(c - '0');
			
			// If the scanned character is an operator, pop two
			// elements from stack apply the operator
			else
			{
				int val1 = stack.pop();
				int val2 = stack.pop();
				
				switch(c)
				{
					case '+':
					stack.push(val2+val1);
					break;
					
					case '-':
					stack.push(val2- val1);
					break;
					
					case '/':
					stack.push(val2/val1);
					break;
					
					case '*':
					stack.push(val2*val1);
					break;
			}
			}
		}
		return stack.pop();
	}
}
