import java.util.Arrays;

public class InitializingArray {
    // Method to declare and initialize an array of integers
    static void intArray() {
        // Direct initialization
        int[] marks = {100, 88, 79};  // Initializing an array of integers
        System.out.println("Directly initialized Integer array: " + Arrays.toString(marks));

        // Declaration with size
        int[] emptyMarks = new int[5];  // Declaring an empty array of integers with size 5
        System.out.println("Declared empty Integer array of size 5: " + Arrays.toString(emptyMarks));
    }

    // Method to declare and initialize an array of strings
    static void strArray() {
        // Direct initialization
        String[] names = {"Nikil", "Paul", "Apple"};  // Initializing an array of strings
        System.out.println("Directly initialized String array: " + Arrays.toString(names));

        // Declaration with size
        String[] emptyNames = new String[3];  // Declaring an empty array of strings with size 3
        System.out.println("Declared empty String array of size 3: " + Arrays.toString(emptyNames));
    }

    // Method to declare and initialize an array of floats
    static void floatArray() {
        // Direct initialization
        float[] scores = {95.5f, 88.0f, 76.5f};  // Initializing an array of floats
        System.out.println("Directly initialized Float array: " + Arrays.toString(scores));

        // Declaration with size
        float[] emptyScores = new float[4];  // Declaring an empty array of floats with size 4
        System.out.println("Declared empty Float array of size 4: " + Arrays.toString(emptyScores));
    }

    // Method to declare and initialize an array of doubles
    static void doubleArray() {
        // Direct initialization
        double[] prices = {19.99, 25.50, 30.00};  // Initializing an array of doubles
        System.out.println("Directly initialized Double array: " + Arrays.toString(prices));

        // Declaration with size
        double[] emptyPrices = new double[3];  // Declaring an empty array of doubles with size 3
        System.out.println("Declared empty Double array of size 3: " + Arrays.toString(emptyPrices));
    }

    // Method to declare and initialize an array of characters
    static void charArray() {
        // Direct initialization
        char[] letters = {'A', 'B', 'C'};  // Initializing an array of characters
        System.out.println("Directly initialized Character array: " + Arrays.toString(letters));

        // Declaration with size
        char[] emptyLetters = new char[3];  // Declaring an empty array of characters with size 3
        System.out.println("Declared empty Character array of size 3: " + Arrays.toString(emptyLetters));
    }

    // Method to declare and initialize an array of booleans
    static void booleanArray() {
        // Direct initialization
        boolean[] flags = {true, false, true};  // Initializing an array of booleans
        System.out.println("Directly initialized Boolean array: " + Arrays.toString(flags));

        // Declaration with size
        boolean[] emptyFlags = new boolean[2];  // Declaring an empty array of booleans with size 2
        System.out.println("Declared empty Boolean array of size 2: " + Arrays.toString(emptyFlags));
    }

    public static void main(String[] args) {
        intArray();         // Calling method to declare and initialize integer array
        strArray();        // Calling method to declare and initialize string array
        floatArray();      // Calling method to declare and initialize float array
        doubleArray();     // Calling method to declare and initialize double array
        charArray();       // Calling method to declare and initialize character array
        booleanArray();    // Calling method to declare and initialize boolean array
    }
}
