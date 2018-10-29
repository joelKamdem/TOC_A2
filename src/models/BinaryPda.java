package models;

import java.security.KeyStore;
import java.util.Scanner;

public class BinaryPda {

    public static boolean isBinaryPda(String pda){

        String pdaPattern = "0+1+";

        return  pda.matches(pdaPattern);
    }
  /*  public static void main(String args[]){



        System.out.println("Enter a Palindrome String to be checked with the PDA");
        Scanner scan = new Scanner(System.in);
        String pda = scan.nextLine();

        System.out.println(isBinaryPda(pda));
    }*/
}
