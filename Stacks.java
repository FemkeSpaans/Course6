package Afvink3;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Femke Spaans
 * <p>
 * Write an application which can check the syntax of a code using a stack.
 * The code will check if all the opened parentheses, straight paretheses, and accolades
 * are correctly opened and closed.
 */
public class Stacks {

    static String expression = "({[]})";
    static Stack<Character> stack_of_expression = new Stack<Character>();
    static char check_expression;

    public static void main(String[] args) {
        check();
    }

    /**
     * loop over the given expression
     * put the opening parentheses in a stack
     * check using switch case if the parentheses are being closed
     * if the stack is empty it is balanced
     * if the stack is not empty it is unbalanced
     *
     * doesn't always give unbalanced when it is unbalanced
     * extra closing parentheses makes no difference to the outcome, which is incorrect
     */
    public static void check() {
        for (int i = 0; i < expression.length(); i++) {
            char position = expression.charAt(i);

            if (position == '(' || position == '[' || position == '{') {
                stack_of_expression.push(position);
            }
            if (!stack_of_expression.isEmpty()){
                System.out.println(stack_of_expression);
                switch(position){
                    case ')':
                        check_expression = stack_of_expression.pop();
                        break;
                    case ']':
                        check_expression = stack_of_expression.pop();
                        break;
                    case '}':
                        check_expression = stack_of_expression.pop();
                        break;
                }
            }
            else{
                System.out.println("Error. You cannot pop from an empty stack");
            }
        }
        if(stack_of_expression.isEmpty()){
            System.out.println("This expression is balanced");
        }
        System.out.println(stack_of_expression);
        if(!stack_of_expression.isEmpty()){
            System.out.println("This expression is unbalanced");
        }
    }
}

// small steps,
// what is your first step?
// you start by asking the user for an expression and saving said expression.
// the opening parentheses are pushed into a stack
// when the code finds a closing bracket it checks the last element which has been pushed to the stack,
// if it matches the opening parentheses it is popped off
// if it does not match it is an invalid parentheses, which means the expression is unbalanced.

