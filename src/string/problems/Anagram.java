package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
//Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
//same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

public class Anagram {


    public static void main(String[] args)
    {
        String st1 = "BRAG";
        String st2 = "GRAB";
        String st3 = "NIGHT";
        String st4 = "THING";
        System.out.println(isAnagram(st1, st2));
        System.out.println(isAnagram(st3, st4));
        System.out.println(isAnagram(st1, st4));
        System.out.println(isAnagram(st2, st3));

    }

    public static boolean isAnagram(String st1, String st2) {
        char[] firstWord = st1.toCharArray();
        char[] secondWord = st2.toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);


        return Arrays.equals(firstWord, secondWord);
    }




    }

