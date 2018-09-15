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
		
		int [] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
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
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "sortingNumber" );
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


		//merge sort
		Sort algo4 = new Sort();
		algo4.mergeSort(num, 0, n-1);
		long mergeSortExecutionTime = algo4.executionTime;
		System.out.println("Total Execution Time of " +num.length + "numbers in merge Sort take: " +mergeSortExecutionTime + "milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
		List<String> numbers4 = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
		printValue(numbers4);
		int n4 = num.length;
		randomize(num, n4);


		//quick sort

		Sort algo5 = new Sort();
		algo5.quickSort(num, 0, n-1);
		long quickSortExecutionTime = algo5.executionTime;
		System.out.println("Total Execution Time of " +num.length + "numbers in quick Sort take: " +quickSortExecutionTime + "milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
		List<String> numbers5 = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");
		printValue(numbers5);
		int n5 = num.length;
		randomize(num, n5);


		//heap sort

		Sort algo6 = new Sort();
		algo6.heapSort(num, n);
		long heapSortExecutionTime = algo5.executionTime;
		System.out.println("Total Execution Time of " +num.length + "numbers in heap Sort take: " +heapSortExecutionTime + "milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
		List<String> number5 = connectToSqlDB.readDataBase("heap_sort", "SortingNumbers");
		printValue(numbers5);
		int n6 = num.length;
		randomize(num, n6);


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
