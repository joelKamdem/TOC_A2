package models;
import java.util.Stack;

public class PalindromeGenerator {

    // The goal of this class is to take a text element
    // Then generate a palindrome of that word
    // In the case the word is already a palindrome, the word is accepted as is
    // Our tactic is to progressively mirror our input string
    // Until we get a palindrome

    public static String makePalindrome(String base){
        String pref = "";
        int i = base.length() - 1;
        while(! Palindrome.isPalindrome(new Stack<Character>(), pref + base)){
            pref = pref + base.charAt(i);
            i --;
        }
        return pref + base;
    }

    public static void main(String[]args){
        System.out.println(PalindromeGenerator.makePalindrome("acbbca"));
    }

}
