public class ByteConversion {

    static void byte2int() {
        // Converting from byte to int - no precision loss since int is larger
        byte num1 = 100;
        int numb1 = (int) num1;

        byte num2 = -100;
        int numb2 = (int) num2;

        System.out.println("Byte to Int Conversion:");
        System.out.println("Original byte: " + num1 + " -> Converted to int: " + numb1);
        System.out.println("Original byte: " + num2 + " -> Converted to int: " + numb2);
    }

    static void int2byte() {
        // Converting from int to byte - potential truncation of high-order bits if the int is out of byte range
        int num1 = 257;
        byte numb1 = (byte) num1;  // Truncates the higher bits, only keeps the last 8 bits

        int num2 = -130;
        byte numb2 = (byte) num2;

        System.out.println("Int to Byte Conversion:");
        System.out.println("Original int: " + num1 + " -> Converted to byte: " + numb1);
        System.out.println("Original int: " + num2 + " -> Converted to byte: " + numb2);
    }

    static void byte2long() {
        // Converting from byte to long - no precision loss since long is larger
        byte num1 = 50;
        long numb1 = (long) num1;

        byte num2 = -50;
        long numb2 = (long) num2;

        System.out.println("Byte to Long Conversion:");
        System.out.println("Original byte: " + num1 + " -> Converted to long: " + numb1);
        System.out.println("Original byte: " + num2 + " -> Converted to long: " + numb2);
    }

    static void long2byte() {
        // Converting from long to byte - possible truncation if long value exceeds byte range (-128 to 127)
        long num1 = 1025L;
        byte numb1 = (byte) num1;  // Truncates the higher bits, keeping only the last 8 bits

        long num2 = -1025L;
        byte numb2 = (byte) num2;

        System.out.println("Long to Byte Conversion:");
        System.out.println("Original long: " + num1 + " -> Converted to byte: " + numb1);
        System.out.println("Original long: " + num2 + " -> Converted to byte: " + numb2);
    }

    static void byte2float() {
        // Converting from byte to float - no precision loss for small values
        byte num1 = 42;
        float numb1 = (float) num1;

        byte num2 = -42;
        float numb2 = (float) num2;

        System.out.println("Byte to Float Conversion:");
        System.out.println("Original byte: " + num1 + " -> Converted to float: " + numb1);
        System.out.println("Original byte: " + num2 + " -> Converted to float: " + numb2);
    }

    static void float2byte() {
        // Converting from float to byte - truncates the decimal part and possible truncation due to byte range
        float num1 = 123.45f;
        byte numb1 = (byte) num1;  // Decimal part is truncated and result is constrained to byte range

        float num2 = -123.45f;
        byte numb2 = (byte) num2;

        System.out.println("Float to Byte Conversion:");
        System.out.println("Original float: " + num1 + " -> Converted to byte: " + numb1);
        System.out.println("Original float: " + num2 + " -> Converted to byte: " + numb2);
    }

    public static void main(String[] args) {
        byte2int();
        int2byte();
        byte2long();
        long2byte();
        byte2float();
        float2byte();
    }
}
