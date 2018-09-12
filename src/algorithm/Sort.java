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
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }

        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        
        
        return list;
    }
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
            //merge(list, low, middle, high);

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = endTime - startTime;

        

        return list;
    }
    

    public int [] quickSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int left=0;
        int right=0;
        int i = left, j = right;
        int tmp;
        int pivot = array[(left + right) / 2];
        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;

            }

        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        
        return list;
    }

    void heapify(int list[], int arrayLength, int rootIndex)
    {
        int largest = rootIndex;
        int leftNodeIndex = 2*rootIndex + 1;
        int rightNodeIndex = 2*rootIndex + 2;


        if (leftNodeIndex < arrayLength && list[leftNodeIndex] > list[largest])
            largest = leftNodeIndex;

        if (rightNodeIndex < arrayLength && list[rightNodeIndex] > list[largest])
            largest = rightNodeIndex;


        if (largest != rootIndex)
        {
            int temp = list[rootIndex];
            list[rootIndex] = list[largest];
            list[largest] = temp;

            heapify(list, arrayLength, largest);
        }
    }
    
    public int [] heapSort(int [] array, int arrayLength){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for (int i=arrayLength-1; i>=0; i--)
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
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
