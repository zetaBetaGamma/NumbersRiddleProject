import java.util.Scanner;



public class NumbersRiddle {



    
    // Multi-line format meant to structure the mathematical calculations of substituting a value into the riddle's formula
    public static final string CALCULATIONS_FORMAT = """
        %f * 2: %f
        %f + 6: %f
        %f / 2: %f
        %f - %f: %d        
        """;

    
    public static String formatCalculations(double numInput) {
        /*
        Takes a double and returns a string that represents the mathematical calculations of substituing that double into the
        riddle's formula  
        */
        
        double multipliedBy2 = 2 * numInput;
        double addedSix = twoTimesNum + 6;
        double dividedBy2 = addedSix / 2;
        // Adding 0.5 to round the difference of the second to last result and the original input
        int subtractedByNumInput = (int) (dividedBy2 - numInput + 0.5);

        
        return CALCULATIONS_FORMAT.format(
            numInput, multipliedBy2,
            multipliedBy2, addedSix,
            addedSix, dividedBy2,
            dividedBy2, numInput, subtractedByNumInput
        );
    }

    
    public static void main(String args) {
        // Each constants represents a different test case of the program, which will be checked to see if substituting each constant
        // into the riddle's formula will cause the program's final caculation to be 3
        int POSITIVE_INT = 1489;
        int NEGATIVE_INT = -1489;
        double POSIITVE_DOUBLE = 89.324;
        double NEGATIVE_DOUBLE = -89.324;
        int ZERO = 0;
        int ONE = 1;
        
        String userInput;
        double userDouble;
        
        try (Scanner scanner = new Scanner(System.in)) {
            userInput = scanner.nextLine();
            if (userInput.contains('.')) {
                userDouble = Double.parseDouble(userInput)
            } else {
                userDouble = (double) userInput;
            }

        } catch (InputMismatchException IME) {
            System.out.println("The user input should be a decimal!");
            return;
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}