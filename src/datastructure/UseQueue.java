package datastructure;

import java.util.Arrays;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
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


