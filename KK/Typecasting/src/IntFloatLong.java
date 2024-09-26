public class IntFloatLong {

    static void int2long() {
        // Converting from int to long - no precision loss since both are integer types
        int num1 = 123;
        long numb1 = (long) num1;  // Simple widening conversion, no data loss

        int num2 = -123;
        long numb2 = (long) num2;

        System.out.println("Int to Long Conversion:");
        System.out.println("Original int: " + num1 + " -> Converted to long: " + numb1);
        System.out.println("Original int: " + num2 + " -> Converted to long: " + numb2);
    }

    static void long2int() {
        // Converting from long to int - possible precision loss if the long value exceeds the int range
        long num1 = 1234567890123L;
        int numb1 = (int) num1;  // May truncate the higher bits if the value is too large for int

        long num2 = -1234567890123L;
        int numb2 = (int) num2;

        System.out.println("Long to Int Conversion:");
        System.out.println("Original long: " + num1 + " -> Converted to int: " + numb1);
        System.out.println("Original long: " + num2 + " -> Converted to int: " + numb2);
    }

    static void float2long() {
        // Converting from float to long - truncates the decimal part
        float num1 = 123.987f;
        long numb1 = (long) num1;  // The decimal part is lost

        float num2 = -123.987f;
        long numb2 = (long) num2;

        System.out.println("Float to Long Conversion:");
        System.out.println("Original float: " + num1 + " -> Converted to long: " + numb1);
        System.out.println("Original float: " + num2 + " -> Converted to long: " + numb2);
    }

    public static void main(String[] args) {
        int2long();
        long2int();
        float2long();
    }
}
