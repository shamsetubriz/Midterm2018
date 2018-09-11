package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) throws Exception{
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		HashMap<Integer, String> hasmap = new HashMap<Integer, String>();

		//Add elements
		hasmap.put(21, "Ayaat");
		hasmap.put(25, "Qurrat");
		hasmap.put(4, "Ridhan");
		hasmap.put(2, "Amelia");
		hasmap.put(3, "Yaseen");

		//Retrieve
		String var = hasmap.get(25);
		System.out.println("Value at index 2 is: " + var);
		String var1 = hasmap.get(4);
		System.out.println("Value at index 3 is : " + var1);

		//Add List<String in to a map.
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		List<String> cityList = new ArrayList<String>();
		cityList.add("Sanford");
		cityList.add("Greenwich");
		cityList.add("Hardford");
		cityList.add("Fairfield");
		cityList.add("Groton");
		list.put("city", cityList);
		System.out.println(list);

		List<String> trainList = new ArrayList<String>();
		trainList.add("LIRR");
		trainList.add("Metro North");
		trainList.add("Amtrack");
		list.put("train", trainList);
		System.out.println(list);


		//forEach loop to retrieve data.
		for (Object str : list.keySet()){
			System.out.println("KeySet: " + str);
			for (String str1 : list.get(str)){
				System.out.println("Value: " + str1);
			}
		}

		//While llop with Iterator to retrieve data
		Iterator itr = list.entrySet().iterator();
		System.out.println("While loop");
		Iterator iterator = list.keySet().iterator();
		while (iterator.hasNext()){
			Object kvalue = iterator.next();
			for (String str1 : list.get(kvalue)){
				System.out.println("value: " +str1);
			}
		}



	}

}
