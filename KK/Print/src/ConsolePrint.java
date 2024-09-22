public class ConsolePrint {
    public static void main(String[] args) {
        // System.out.println() - Prints the output followed by a new line.
        // Each call to println() moves the cursor to the next line automatically after printing.
        System.out.println("Vanakanga!");  // Prints "Vanakanga!" and moves to the next line

        // System.out.print() - Prints the output without a newline.
        // The cursor stays on the same line, allowing multiple prints to appear on a single line.
        System.out.print("Hi ");  // Prints "Hi " and stays on the same line
        System.out.print("Guys!!\n");  // Prints "Guys!!" and adds a newline using '\n'

        // System.out.printf() - Prints formatted output.
        // Allows you to insert variables into the string with format specifiers.
        // Common format specifiers:
        // %s -> String
        // %d -> Integer
        // %f -> Floating-point number
        // %n -> Newline (platform-independent alternative to '\n')
        // Example: %s for String, %d for Integer, etc.
        System.out.printf("Hello, %s! You have %d new messages.%n", "Nikil", 5);
        // Explanation:
        // - %s is replaced with "Nikil"
        // - %d is replaced with 5
        // - %n adds a new line (similar to '\n')

        // System.out.println() again for simple output, moving the cursor to the next line.
        System.out.println("Program has completed output operations.");  // Simple println to signal end of program
    }
}
