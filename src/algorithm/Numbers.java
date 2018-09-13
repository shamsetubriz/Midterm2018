package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[100];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);


		//Insertion Sort
		Sort algo1 = new Sort();
		algo1.insertionSort(num);
		long insertionSortExecutionTime = algo1.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
		List<String> numbers1 = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
		printValue(numbers1);
		int n1 = num.length;
		randomize(num, n1);

		//By following above, Continue for rest of the Sorting Algorithm....


		//bubble sort
		Sort algo2 = new Sort();
		algo2.bubbleSort(num);
		long bubbleSortExecutionTime = algo2.executionTime;
		System.out.println("Total Execution Time of " + num.length + "numbers in Bubble Sort take: " +bubbleSortExecutionTime + "milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumber" );
		List<String> numbers2 = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
		printValue(numbers2);
		int n2 = num.length;
		randomize(num, n2);


		//shell sort

		Sort algo3 = new Sort();
		algo3.shellSort(num);
		long shellSortExecutionTime = algo3.executionTime;
		System.out.println("Total Execution Time of " +num.length + "numbers in shell Sort take: " +shellSortExecutionTime + "milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
		List<String> numbers3 = connectToSqlDB.readDataBase("shell_sort", "SortingNumbers");
		printValue(numbers3);
		int n3 = num.length;
		randomize(num, n3);


		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
