/*
 Programmer: Kenji Onishi
 Date Created: 09/18/2024
 Description: This program is meant to test if the number riddle that states that, given a number x,
 ((2 * x + 6) / 2) - x == 3, is true. Each test is done by printing the intermediate results of each 
 operation required when calculating (2 * x + 6) / 2) - x and checking if all of the final results are
 the integer 3.  
 */
import java.util.Scanner;



public class NumbersRiddle {
    public static void printCalculations(double numInput) {
        /*
        Takes a double and prints the mathematical calculations of substituting that double into the
        x of the riddle's formula (2 * x + 6) / 2) - x on separate lines. 
        */        
        double prevAccumulator = numInput;
        double currAccumulator = prevAccumulator * 2;
        System.out.println(
            String.format("%.1f * 2 = %.1f", prevAccumulator, currAccumulator));
        prevAccumulator = currAccumulator;
        currAccumulator += 6;
        System.out.println(
            String.format("%.1f + 6 = %.1f", prevAccumulator, currAccumulator));
        prevAccumulator = currAccumulator;
        currAccumulator /= 2;
        System.out.println(
            String.format("%.1f / 2 = %.1f", prevAccumulator, currAccumulator)
        );
        prevAccumulator = currAccumulator;
        currAccumulator -= numInput;
        System.out.println(
            String.format("%.1f - %.1f = %d", prevAccumulator, numInput, (int) (currAccumulator))
        );
    }

    
    public static void main(String[] args) {
        // Each constants represents a different test case of the program, which will be checked to see 
        // if substituting each constant into the riddle's formula will cause the program's final 
        // calculation to be 3
        int POSITIVE_INT = 1489;
        int NEGATIVE_INT = -1489;
        double POSIITVE_DOUBLE = 89.5;
        double NEGATIVE_DOUBLE = -89.9;
        int ZERO = 0;
        int ONE = 1;
        
        String userInput;
        double userDouble;
        
        System.out.print("Enter a decimal or integer: ");
        try (Scanner scanner = new Scanner(System.in)) {
            userInput = scanner.nextLine();
            if (userInput.contains(".")) {
                userDouble = Double.parseDouble(userInput);
            } else {
                userDouble = (double) (Integer.parseInt(userInput));
            }

        } catch (NumberFormatException NFE) {
            System.out.println("The user input should be a decimal!");
            return;
        }
        System.out.println("USER INPUT CASE: ");
        printCalculations(userDouble);
        System.out.println("POSITIVE INT CASE: ");
        printCalculations(POSITIVE_INT);
        System.out.println("NEGATIVE INT CASE: ");
        printCalculations(NEGATIVE_INT);
        System.out.println("POSITIVE DOUBLE CASE: ");
        printCalculations(POSIITVE_DOUBLE);
        System.out.println("NEGATIVE DOUBLE CASE: ");
        printCalculations(NEGATIVE_DOUBLE);
        System.out.println("ZERO CASE: ");
        printCalculations(ZERO);
        System.out.println("ONE CASE: ");
        printCalculations(ONE);
        
    }

}