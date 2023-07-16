# TurnkeyAssessments

# Assessments Q1
Task:
 -A Java program that generates a Fibonacci sequence.

Solution:
-Fibonacci.java file provides solution to this task.
-The program asks for input from the user and validates the input to ensure it's a positive integer. If the input is not a positive
 integer or not an integer at all, relevant error messages are displayed.
-Used recursion to generate Fibonacci sequence and memorization to improve the performance of the program.
-Memorization improves recursive algorithm performance by avoiding redundant computations through storing results in an array.




# Assessments Q2
Task:
 -A function that takes a list of integers as input and returns the largest difference between any two numbers in the list.

Solution:
-LargestDifference.java solves the task.
-The program accepts input lists of any size from the user and handles errors by displaying relevant error messages.
-The method rerurns 0 if the list has less than two elements.




# Assessments Q3
Task:
 -SQL query that selects all employees whose age is above 30 and salary is above $50,000, the table name is 'employees' with
  "id" (integer), "name" (text), "age" (integer), and "salary" (float) as columns.

Solution:
-employee_query.sql provides solution to the task.
-The SQL statement combines 'WHERE' & 'AND' clause to meet the above conditions.
-The query is optimized using indexing, selecting only the necessary columns instead of using 'SELECT *', and using 
 appropriate data types for 'age' and 'salary' columns.




# Assessments Q4
Task:
 -Identify the bug and fix the code so that it correctly calculates and displays the average of a list of numbers.

Solution:
-AverageCalculator.java fixes the bug.
-The bug in the code is due to integer division in the line 'double average = total / numbers.length;'
-Since 'total' and 'numbers.length' are both integers, the division will perform integer division, 
 resulting in a truncated quotient.
-To fix the bug, ensure that the division is done using floating-point division. 
-One way to do this is by explicitly casting total to a double before dividing.

