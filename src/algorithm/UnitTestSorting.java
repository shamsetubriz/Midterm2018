package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array of Selection sort is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        //Bubble Sort
        int[] unsortedArray1 = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray1 =   {0, 1, 2, 4, 5, 6, 9};

        sort.bubbleSort(unsortedArray1);
        try {
            Assert.assertEquals(sortedArray1, unsortedArray1, "Array of Bubble sort is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //insertion sort
        int[] unSortedArray2 = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray2 =   {0, 1, 2, 4, 5, 6, 9};
        sort.insertionSort(unSortedArray2);
        try {
            Assert.assertEquals(sortedArray2, unSortedArray2, "Array of Insertion Sort is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //bucket sort
       /* int[] onsortedAray3 = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedAray3 =   {0, 1, 2, 4, 5, 6, 9};
        sort.bucketSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array of Bucket Sort is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();*/

       //Heap sort

        int[] unSortedArray3 = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray3 =   {0, 1, 2, 4, 5, 6, 9};
        sort.heapSort(unSortedArray3, unSortedArray3.length);
        try {
            Assert.assertEquals(sortedArray3, unSortedArray3, "Array of Heap Sort is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //shell Sort

        int[] unSortedArray4 = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray4 =   {0, 1, 2, 4, 5, 6, 9};
        sort.shellSort(unSortedArray4);
        try {
            Assert.assertEquals(sortedArray4, unSortedArray4, "Array of Insertion Sort is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //


    }
}
