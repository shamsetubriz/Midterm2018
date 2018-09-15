package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        for(int i = 0; i < list.length - 1; i++){
            for(int j = 0; j < list.length - 1; j++){
                if(list[j] > list[j + 1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }

            }

        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        
        
        return list;
    }

    //merge sort
    void merge(int list[], int low, int middle, int high)
    {
        int i, j, k;
        int leftArrayLength = middle - low + 1;
        int rightArrayLength =  high - middle;

        int[] leftArray=new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];

        for (i = 0; i < leftArrayLength; i++)
            leftArray[i] = list[low + i];
        for (j = 0; j < rightArrayLength; j++)
            rightArray[j] = list[middle + 1+ j];

        i = 0;
        j = 0;
        k = low;
        while (i < leftArrayLength && j < rightArrayLength)
        {
            if (leftArray[i] <= rightArray[j])
            {
                list[k] = leftArray[i];
                i++;
            }
            else
            {
                list[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArrayLength)
        {
            list[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArrayLength)
        {
            list[k] = rightArray[j];
            j++;
            k++;
        }
    }
    

    public int [] mergeSort(int [] array, int firstIndex, int lastIndex){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int low = firstIndex;
        int high = lastIndex;
        if (low < high)
        {
            int middle = low + (high - low)/2;
            mergeSort(list, low, middle);
            mergeSort(list, middle+1, high);
            merge(list, low, middle, high);

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;


        return list;
    }

    int partition (int list[], int low, int high)
    {
        int pivot = list[high];
        int i = (low - 1);
        for (int j = low; j <= high -1; j++)
        {
            if (list[j] <= pivot)
            {
                i++;
                int temp = list[i];
                list[i] = list [j];
                list[j] = temp;
            }
        }
        int temp = list[i+1];
        list[i+1] = list[high];
        list[high] = temp;
        return  (i + 1);
    }
    
    //quick sort
    public int [] quickSort(int [] array,int firstIndex, int lastIndex){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int low = firstIndex;
        int high = lastIndex;
        if (low < high);
        {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        
        return list;
    }

    public void heapify(int list[], int n, int i)
    {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && list[left] > list[largest])
            largest = left;

        if (right < n && list[right] > list[largest])
            largest = right;

        if (largest != i)
        {
            int swap = list[i];
            list[i] = list[i];
            list[largest] = swap;
            heapify(list, n, largest);
        }
    }
    
    public int [] heapSort(int [] array, int arrayLength){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for (int i = arrayLength/2-1; i>=0; i--)
        heapify(list, arrayLength, i);

        for (int i = arrayLength - 1; i >= 0; i--)
        {
            int temp =list[0];
            list[0] = list[i];
            list[i] = temp;

            heapify(list, i, 0);

        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        

        return list;
    }


    public int [] bucketSort(int [] array,int maxArrayElementValue){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int max = maxArrayElementValue;
        int [] bucket=new int[max+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<list.length; i++) {
            bucket[list[i]]++;
        }

        int position=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                list[position++]=i;
            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }
    
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int inn, out;
        int temp;
        int n = 1;

        while (n <= array.length / 3){
            n = n * 3 + 1;
        }
        while (n > 0){
            for (out = n; out < array.length; out++){
                temp = array[out];
                inn = out;

                while (inn > n-1 && array[inn - n] >= temp){
                    array[inn] = array[inn - n];
                    inn -=n;
                }
                array[inn] = temp;
            }
            n = (n - 1) / 3;
        }

        final long endTine = System.currentTimeMillis();
        final long executionTime = endTine - startTime;
        this.executionTime = executionTime;

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
