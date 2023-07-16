
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LargestDifference {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		
		//Prompt user for input and handle errors
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of elements in the list: ");
		try {
			
			int n = scanner.nextInt();
			if (n < 1) {
				System.out.println("The list must have at least one element.");
			} else {
				System.out.println("Enter elements of the list:");

				for (int i = 0; i < n; i++) {
					int num = scanner.nextInt();
					numbers.add(num);
				}

				//Print the difference
				int difference = findDifference(numbers);
				System.out.println("Largest difference: " + difference);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input! Please enter an integer.");
		}
		scanner.close();
	}



	//Method to calculate largest difference between any two numbers in a list
	public static int findDifference(List<Integer> numbers) {
		if (numbers == null || numbers.size() < 2) {
			return 0;
		}

		int min = Collections.min(numbers);
		int max = Collections.max(numbers);

		return max - min;
	}
}
