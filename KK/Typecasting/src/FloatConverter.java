public class FloatConverter {

    static void int2float() {
        int num1 = 12345;
        float floatNum1 = (float) num1;

        int num2 = -6789;
        float floatNum2 = (float) num2;

        System.out.println("Int to Float Conversion:");
        System.out.println("Original int: " + num1 + " -> Converted to float: " + floatNum1);
        System.out.println("Original int: " + num2 + " -> Converted to float: " + floatNum2);
    }

    static void double2float() {
        double num1 = 1234.567;  // Precision will be lost due to conversion from double to float
        float floatNum1 = (float) num1;

        double num2 = -6789.123;  // Precision will be lost
        float floatNum2 = (float) num2;

        System.out.println("Double to Float Conversion:");
        System.out.println("Original double: " + num1 + " -> Converted to float: " + floatNum1);
        System.out.println("Original double: " + num2 + " -> Converted to float: " + floatNum2);
    }

    static void long2float() {
        long num1 = 123456789L;
        float floatNum1 = (float) num1;

        long num2 = -987654321L;
        float floatNum2 = (float) num2;

        System.out.println("Long to Float Conversion:");
        System.out.println("Original long: " + num1 + " -> Converted to float: " + floatNum1);
        System.out.println("Original long: " + num2 + " -> Converted to float: " + floatNum2);
    }

    public static void main(String[] args) {
        int2float();
        double2float();
        long2float();
    }
}
