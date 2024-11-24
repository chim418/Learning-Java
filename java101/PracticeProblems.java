public class PracticeProblems {
    public static void main(String[] args) {
	}

    // Problem #1
	public static int countOccurrences(int[] arr, int n) { // The function 'countOccurrences' will take the array and an integer as a input.
		int count = 0; // Tracks how many times the number occurs.
		for (int num : arr) { // For each number (num) in the array (arr), do something.
			if (num == n) { // Checks if the current number is equal to the target number.
				count++; // If it is, then add one to the count.
			}
		}
		return count; // The function outputs the number of times the targeted number occurs.
	}
    
    // Problem #2
    public static int[] reverseArray(int[] arr) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Defines the values in the array.
        int[] reversed = new int[array.length]; // Makes a new array that takes the length of the previous array.
        for (int i = 0; i < array.length; i++){ // Loops the reversal of the orignal array into the new one.
            reversed[i] = array[array.length -1 -i];
        }
        return reversed;
    }

    // Problem #3
    public static double sumGrid(double[][] grid){
        double sum = 0;
        for (double[] grid1 : grid) {
            for (int j = 0; j < grid1.length; j++) {
                sum += grid1[j];
            }
        }
        return sum;
    }

    // Problem #4
    public static int fib(int n){
        if (n == 0){ // VSCode suggests replacing chain of ifs with switch.
            return 0; 
        } else if (n == 1){
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}
