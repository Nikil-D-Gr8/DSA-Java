public class FloatInt {

    static void float2int() {
        // Converting from float to int - the fractional part is truncated
        float num1 = 1.987f;
        int numb1 = (int) num1;  // Truncates the decimal part, keeps only the integer part

        float num2 = -1.987f;
        int numb2 = (int) num2;

        System.out.println("Float to Int Conversion:");
        System.out.println("Original float: " + num1 + " -> Converted to int: " + numb1);
        System.out.println("Original float: " + num2 + " -> Converted to int: " + numb2);
    }

    static void int2float() {
        // Converting from int to float - there will be no fractional part in the result
        int num1 = 123;
        float numb1 = (float) num1;  // Conversion keeps the integer part as a float

        int num2 = -123;
        float numb2 = (float) num2;

        System.out.println("Int to Float Conversion:");
        System.out.println("Original int: " + num1 + " -> Converted to float: " + numb1);
        System.out.println("Original int: " + num2 + " -> Converted to float: " + numb2);
    }

    public static void main(String[] args) {
        float2int();
        int2float();
    }
}
