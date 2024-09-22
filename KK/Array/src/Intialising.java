import java.util.Arrays;

public class Intialising {
    static void intarray()
    {
        //initialising an array of integers
        int[] marks = { 100,88,79};
        //printing an array by converting it to a string as default print can only do string printing
        System.out.println(Arrays.toString(marks));
    }

    static void strarray()
    {
        //intitialising an array of string
        String[] names = {"nikil","Paul","apple"};
        System.out.println(Arrays.toString(names));
    }

    public static void main(String[] args) {
        intarray();
        strarray();
    }

}
