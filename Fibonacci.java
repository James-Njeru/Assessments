import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

	private static long[] fibonacciCache;
			
	public static void main(String[] args) {
		
        // Get user input
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        // Prompt user for input and handle errors
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter a positive integer: ");
            try {
                input = scanner.nextInt();
                if (input < 0) {
                    System.out.println("Invalid input! Please enter a positive integer.");
                    System.out.println("");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                System.out.println("");
                scanner.nextLine(); // Clear the input buffer
            }
        }
        scanner.close();
        
        fibonacciCache = new long[input + 1];
        
		// Print the Fibonacci sequence
		for (int i = 0; i <= input; i++) {
			System.out.print(fibonacciNumber(i) + " ");
		}
	}

	
	
	// Recursive method to calculate Fibonacci number
	private static long fibonacciNumber(int n) {
		//base case
		if (n<=1) {
			return n;
		}
		
		if (fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		
		//algorithm: f(n) = f(n-1) + f(n-2)
		long nthFibonacciNumber = (fibonacciNumber(n-1) + fibonacciNumber(n-2));
		//Store the calculated value in an array
		fibonacciCache[n] = nthFibonacciNumber;
		
		return nthFibonacciNumber;
	}
}
