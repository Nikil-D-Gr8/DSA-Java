public class IntConverter {

    static void float2int() {
        float num1 = 123.45f;  // Decimal part will be truncated
        int intNum1 = (int) num1;

        float num2 = -987.65f;  // Decimal part will be truncated
        int intNum2 = (int) num2;

        System.out.println("Float to Int Conversion:");
        System.out.println("Original float: " + num1 + " -> Converted to int: " + intNum1);
        System.out.println("Original float: " + num2 + " -> Converted to int: " + intNum2);
    }

    static void double2int() {
        double num1 = 1234.567;  // Decimal part will be truncated
        int intNum1 = (int) num1;

        double num2 = -6789.123;  // Decimal part will be truncated
        int intNum2 = (int) num2;

        System.out.println("Double to Int Conversion:");
        System.out.println("Original double: " + num1 + " -> Converted to int: " + intNum1);
        System.out.println("Original double: " + num2 + " -> Converted to int: " + intNum2);
    }

    static void long2int() {
        long num1 = 123456789123L;  // Exceeds int range, will be truncated
        int intNum1 = (int) num1;

        long num2 = 98765L;  // Within int range
        int intNum2 = (int) num2;

        System.out.println("Long to Int Conversion:");
        System.out.println("Original long: " + num1 + " -> Converted to int: " + intNum1);
        System.out.println("Original long: " + num2 + " -> Converted to int: " + intNum2);
    }

    public static void main(String[] args) {
        float2int();
        double2int();
        long2int();
    }
}
