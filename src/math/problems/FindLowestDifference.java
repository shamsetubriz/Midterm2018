package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    //Funtion to calculate small result between two Arrays.
    static int findSmallestDifference(int A[], int B[], int m, int n)

    {
        //Sort both arrays using sort function
        Arrays.sort(A);
        Arrays.sort(B);

        int a = 0, b = 0;

        //initialize result as max value
        int result = Integer.MAX_VALUE;

        //scan both Arrays upto size of the Arrays
        while (a < m && b < n)
        {
            if (Math.abs(A[a] - B[b]) < result)
                result = Math.abs(A[a] - B[b]);

            //move smaller value
            if (A[a] < B[b])
                a++;
            else
                b++;
        }

        //return final result
        return result;
    }

    //Driver Code
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
        */

        //Input given array A
        int A[] = {30,12,5,9,2,20,33,1};

        //Input given array B
        int B[] = {18,25,41,47,17,36,14,19};

        //Calculate size of both arrays
        int m = A.length;
        int n = B.length;

        //Call function to print smallest result
        System.out.println(findSmallestDifference(A, B, m, n));



    }

}
