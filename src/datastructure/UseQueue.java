package datastructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<Integer> newQ = new LinkedList<Integer>();

		// Add elements.
		newQ.add(212);
		newQ.add(84);
		newQ.add(473);
		newQ.add(5642);
		newQ.add(233);

		//peek, poll, remove
		System.out.println(newQ.peek());
		System.out.println(newQ.poll());
		System.out.println(newQ.peek());
		System.out.println(newQ.remove());
		System.out.println(newQ.peek());

		//For Each loop.

		System.out.println("Use of for each loop to retrieve data: ");
		for (Integer in : newQ) {
			System.out.println(in);
		}

		//while loop with Iterator.
		System.out.println("Use of while loop to retrieve data: ");
		Iterator itr = newQ.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}

	}
}

