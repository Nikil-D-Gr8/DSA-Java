import java.util.Arrays;

public class DeclaringArray {
    // Method to declare an array of integers
    static void intArray() {
        int[] marks;  // Declaring an array of integers
        System.out.println("Integer array declared.");
    }

    // Method to declare an array of strings
    static void strArray() {
        String[] names;  // Declaring an array of strings
        System.out.println("String array declared.");
    }

    // Method to declare an array of floats
    static void floatArray() {
        float[] scores;  // Declaring an array of floats
        System.out.println("Float array declared.");
    }

    // Method to declare an array of doubles
    static void doubleArray() {
        double[] prices;  // Declaring an array of doubles
        System.out.println("Double array declared.");
    }

    // Method to declare an array of characters
    static void charArray() {
        char[] letters;  // Declaring an array of characters
        System.out.println("Character array declared.");
    }

    // Method to declare an array of booleans
    static void booleanArray() {
        boolean[] flags;  // Declaring an array of booleans
        System.out.println("Boolean array declared.");
    }

    public static void main(String[] args) {
        intArray();         // Calling method to declare integer array
        strArray();        // Calling method to declare string array
        floatArray();      // Calling method to declare float array
        doubleArray();     // Calling method to declare double array
        charArray();       // Calling method to declare character array
        booleanArray();    // Calling method to declare boolean array
    }
}
