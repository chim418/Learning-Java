
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Problem #1
		int[] numbers = {1, 2, 3, 4, 5, 2, 2, 4, 5, 6, 10, 21, 22, 4, 2, 2, 3, 4, 5, 6}; // Defines the array of values being used.
		int target = 2; // Defines what number will be targeted.
		System.out.println("Number " + target + " occurs " + PracticeProblems.countOccurrences(numbers, 2) + " times.");

		// Problem #2
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("The array reversed is: " + Arrays.toString(PracticeProblems.reverseArray(array)));

		// Problem #3
		double[][] decimalGrid = {
			{1.1, 1.2, 1.3},
			{2.1, 2.2, 2.3},
			{3.1, 3.2, 3.3}
		};

		double total = PracticeProblems.sumGrid(decimalGrid);
		System.out.println("The sum of all elements in the grid is: " + total);

		// Problem #4
		int n = 7;
		System.out.println(PracticeProblems.fib(n));
	}
}