package models;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    /* what we want to do is split the palindrome in half,
	and check the second half with the first half.
	If odd, the middle value should be used as a pivot point,
	if Even, we only need to determine where the middle is and push till then
	*/
    static Boolean isPalindrome(Stack<Character> stack, String inp)
    {
        inp = inp.toLowerCase();
        for(int i = 0; i < (inp.length()/2); i++) //represents Q0
        {
            stack.push(inp.charAt(i));
        }

        // represents the change condition for Q0 to Q1
        if (inp.length()%2 == 0)
        {
            inp = inp.substring(inp.length()/2);
        }
        else if (inp.length()%2 != 0)
        {
            inp = inp.substring((inp.length()/2) +1);
        }
        //System.out.println(stack.peek());

        for(int j = 0; j < inp.length(); j++) //Continues on Q1 until empty, at which point it switches to Q2 (the accepted state). If not a palindrome, adds a ~ to the stack to represent a dead state
        {
            if(stack.peek() == inp.charAt(j))
            {
                stack.pop();
            }
            else
            {
                //stack.push('~'); //represents moving to a dead state
            }
        }
        if(stack.isEmpty())
        {
            return Boolean.TRUE;
        }
        else
        {
            return Boolean.FALSE;
        }


    }
  /*  public static void main(String args[])
    {
        Stack<Character> stack = new Stack<Character>();
        Scanner scan;

        System.out.println("Enter a Palindrome String to be checked with the PDA");
        scan = new Scanner(System.in);
        String inp = scan.nextLine();

        System.out.println(isPalindrome(stack, inp));


    }*/
}
