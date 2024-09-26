public class LongConverter {

    static void int2long() {
        int num1 = 12345;
        long longNum1 = (long) num1;

        int num2 = -6789;
        long longNum2 = (long) num2;

        System.out.println("Int to Long Conversion:");
        System.out.println("Original int: " + num1 + " -> Converted to long: " + longNum1);
        System.out.println("Original int: " + num2 + " -> Converted to long: " + longNum2);
    }

    static void float2long() {
        float num1 = 123.45f;  // Decimal part will be truncated
        long longNum1 = (long) num1;

        float num2 = -987.65f;  // Decimal part will be truncated
        long longNum2 = (long) num2;

        System.out.println("Float to Long Conversion:");
        System.out.println("Original float: " + num1 + " -> Converted to long: " + longNum1);
        System.out.println("Original float: " + num2 + " -> Converted to long: " + longNum2);
    }

    static void double2long() {
        double num1 = 1234.567;  // Decimal part will be truncated
        long longNum1 = (long) num1;

        double num2 = -6789.123;  // Decimal part will be truncated
        long longNum2 = (long) num2;

        System.out.println("Double to Long Conversion:");
        System.out.println("Original double: " + num1 + " -> Converted to long: " + longNum1);
        System.out.println("Original double: " + num2 + " -> Converted to long: " + longNum2);
    }

    public static void main(String[] args) {
        int2long();
        float2long();
        double2long();
    }
}
