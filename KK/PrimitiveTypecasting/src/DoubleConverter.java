public class DoubleConverter {

    static void int2double() {
        int num1 = 12345;
        double doubleNum1 = (double) num1;

        int num2 = -6789;
        double doubleNum2 = (double) num2;

        System.out.println("Int to Double Conversion:");
        System.out.println("Original int: " + num1 + " -> Converted to double: " + doubleNum1);
        System.out.println("Original int: " + num2 + " -> Converted to double: " + doubleNum2);
    }

    static void float2double() {
        float num1 = 123.45f;
        double doubleNum1 = (double) num1;

        float num2 = -987.65f;
        double doubleNum2 = (double) num2;

        System.out.println("Float to Double Conversion:");
        System.out.println("Original float: " + num1 + " -> Converted to double: " + doubleNum1);
        System.out.println("Original float: " + num2 + " -> Converted to double: " + doubleNum2);
    }

    static void long2double() {
        long num1 = 123456789L;
        double doubleNum1 = (double) num1;

        long num2 = -987654321L;
        double doubleNum2 = (double) num2;

        System.out.println("Long to Double Conversion:");
        System.out.println("Original long: " + num1 + " -> Converted to double: " + doubleNum1);
        System.out.println("Original long: " + num2 + " -> Converted to double: " + doubleNum2);
    }

    public static void main(String[] args) {
        int2double();
        float2double();
        long2double();
    }
}
