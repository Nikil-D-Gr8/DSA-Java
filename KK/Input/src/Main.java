import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instantiate a Scanner object to take input from the command line.
        Scanner input = new Scanner(System.in);

        // Reading a String input
        System.out.print("Please enter a string: ");
        String userInputString = input.nextLine();
        System.out.println("You entered the string: " + userInputString);

        // Reading till the first space in the input
        System.out.print("Please enter anything which contains a space: ");
        String userInput = input.next();
        System.out.println("The first piece of the input is: " + userInput);

        // Clear the buffer after using next()
        input.nextLine();  // This clears the buffer and prevents the leftover input from interfering

        // Reading an integer input
        System.out.print("Please enter an integer: ");
        int userInputInt = input.nextInt();
        System.out.println("You entered the integer: " + userInputInt);

        // Reading a float input
        System.out.print("Please enter a float: ");
        float userInputFloat = input.nextFloat();
        System.out.println("You entered the float: " + userInputFloat);

        // Reading a double input
        System.out.print("Please enter a double: ");
        double userInputDouble = input.nextDouble();
        System.out.println("You entered the double: " + userInputDouble);

        // Reading a long input
        System.out.print("Please enter a long: ");
        long userInputLong = input.nextLong();
        System.out.println("You entered the long: " + userInputLong);

        // Reading a boolean input
        System.out.print("Please enter a boolean (true/false): ");
        boolean userInputBoolean = input.nextBoolean();
        System.out.println("You entered the boolean: " + userInputBoolean);

        // Close the Scanner object to free up resources.
        input.close();
    }
}
