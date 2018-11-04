package models;

public class PalindromeGenerator {

    // The goal of this class is to take a text element
    // Then generate a palindrome of that word
    // In the case the word is already a palindrome, the word is accepted as is
    // Our tactic is to progressively mirror our input string
    // Until we get a palindrome

    public static String makePalindrome(String base){
        String pref = "";
        int i = base.length() - 1;
        Stack<Character> stack = new Stack<Character>();
        while(! Palindrome.isPalindrome(stack, pref + base)){
            pref = pref + base.charAt(i);
            i --;
        }
        return pref + base;
    }

}
