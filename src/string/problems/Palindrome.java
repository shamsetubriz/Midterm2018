package string.problems;

import java.sql.SQLOutput;
 /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */


public class Palindrome {

    public static void checkpalindrome(String s)
    {
        //following code will reverse the given String.
        String reverse = new StringBuffer(s).reverse().toString();

        //Following command will check whether the String is palindrome or not.
        if (s.equals(reverse))
            System.out.println("Yes");
        else
                System.out.println("No");
}
    public static void main(String[] args) throws java.lang.Exception
    {
        checkpalindrome("repper");
        checkpalindrome("peopleNtech");

    }
}
