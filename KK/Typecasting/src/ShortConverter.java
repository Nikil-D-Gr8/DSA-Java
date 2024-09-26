public class ShortConverter {

    static void int2short() {
        int num1 = 32768;  // Value exceeds short range, will be truncated
        short shortNum1 = (short) num1;  // Will result in overflow

        int num2 = 12345;  // Within short range
        short shortNum2 = (short) num2;

        System.out.println("Int to Short Conversion:");
        System.out.println("Original int: " + num1 + " -> Converted to short: " + shortNum1);
        System.out.println("Original int: " + num2 + " -> Converted to short: " + shortNum2);
    }

    static void float2short() {
        float num1 = 123.45f;  // Decimal part will be truncated
        short shortNum1 = (short) num1;  // Float will be converted to int, then truncated to short

        float num2 = 32768.99f;  // Exceeds short range, will be truncated and overflow
        short shortNum2 = (short) num2;

        System.out.println("Float to Short Conversion:");
        System.out.println("Original float: " + num1 + " -> Converted to short: " + shortNum1);
        System.out.println("Original float: " + num2 + " -> Converted to short: " + shortNum2);
    }

    static void double2short() {
        double num1 = 1234.567;  // Decimal part will be truncated
        short shortNum1 = (short) num1;  // Double will be converted to int, then truncated to short

        double num2 = 50000.0;  // Exceeds short range, will be truncated and overflow
        short shortNum2 = (short) num2;

        System.out.println("Double to Short Conversion:");
        System.out.println("Original double: " + num1 + " -> Converted to short: " + shortNum1);
        System.out.println("Original double: " + num2 + " -> Converted to short: " + shortNum2);
    }

    static void long2short() {
        long num1 = 123456789L;  // Exceeds short range, will be truncated and overflow
        short shortNum1 = (short) num1;

        long num2 = 32767L;  // Within short range
        short shortNum2 = (short) num2;

        System.out.println("Long to Short Conversion:");
        System.out.println("Original long: " + num1 + " -> Converted to short: " + shortNum1);
        System.out.println("Original long: " + num2 + " -> Converted to short: " + shortNum2);
    }

    public static void main(String[] args) {
        int2short();
        float2short();
        double2short();
        long2short();
    }
}
