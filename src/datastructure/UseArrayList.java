package datastructure;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> arList = new ArrayList<>();

		//We will add element to the ArrayList in the following code.
		arList.add(100);
		arList.add(150);
		arList.add(200);
		arList.add(250);
		arList.add(300);
		arList.add(350);

		//Following code will print the Array List
		System.out.println("Retrieveing elements from ArrayList: " + arList);

		//Peek the first element.
		System.out.println("Peek the first element: " + arList.get(0));

		//Remove element from index number 2.
		System.out.println("Remove element from index 2: " + arList.remove(2));

		//Retrieving element.
		System.out.println("Re-retrieving elements from ArrayList: " + arList);


		//use of forEach loop
		for (Integer in : arList){
			System.out.println(in);
		}

		//Iterator
		Iterator it = arList.iterator();
		while (it.hasNext()){
			Integer i = (Integer) it.next();
			System.out.println(i);
		}








	}


}
