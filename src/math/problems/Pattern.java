package math.problems;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String[] args) throws Exception {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		int count = 1, x = 0;
		int num = 100;

		List<String> storePattern = new ArrayList<String>();
		int [] array1 = new int[40];

		while (num > 0){
			for (int y = 0; y < 10; y++){
				System.out.println(" " + num);
				array1[y] = num;
				num -=count;
				y++;

			}
			count++;
		}
		System.out.println(" ");

		}
}
