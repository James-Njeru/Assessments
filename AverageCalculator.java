

/*The bug in the code is due to integer division in the line double average = total / numbers.length; 
Since total and numbers.length are both integers, the division will perform integer division, 
resulting in a truncated quotient.

To fix the bug, ensure that the division is done using floating-point division. 
One way to do this is by explicitly casting total to a double before dividing*/

public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        double average = (double) total / numbers.length;
        return average;
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 37};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
}
