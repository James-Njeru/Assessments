import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestDifference {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

       //Prompt user for input and handle errors
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the list (enter 'q' to stop):");
        while (true) {
            try {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    break;
                }
                int num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to stop.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
        } else {
        	//Print the difference
			int difference = findDifference(numbers);
			System.out.println("Largest difference: " + difference);
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
