public class BooleanConversion {

    static void boolean2int() {
        // Converting from boolean to int - true maps to 1, false maps to 0
        boolean bool1 = true;
        int num1 = bool1 ? 1 : 0;

        boolean bool2 = false;
        int num2 = bool2 ? 1 : 0;

        System.out.println("Boolean to Int Conversion:");
        System.out.println("Original boolean: " + bool1 + " -> Converted to int: " + num1);
        System.out.println("Original boolean: " + bool2 + " -> Converted to int: " + num2);
    }

    static void int2boolean() {
        // Converting from int to boolean - non-zero values map to true, 0 maps to false
        int num1 = 1;
        boolean bool1 = (num1 != 0);

        int num2 = 0;
        boolean bool2 = (num2 != 0);

        System.out.println("Int to Boolean Conversion:");
        System.out.println("Original int: " + num1 + " -> Converted to boolean: " + bool1);
        System.out.println("Original int: " + num2 + " -> Converted to boolean: " + bool2);
    }

    static void boolean2long() {
        // Converting from boolean to long - true maps to 1, false maps to 0
        boolean bool1 = true;
        long num1 = bool1 ? 1L : 0L;

        boolean bool2 = false;
        long num2 = bool2 ? 1L : 0L;

        System.out.println("Boolean to Long Conversion:");
        System.out.println("Original boolean: " + bool1 + " -> Converted to long: " + num1);
        System.out.println("Original boolean: " + bool2 + " -> Converted to long: " + num2);
    }

    static void long2boolean() {
        // Converting from long to boolean - non-zero values map to true, 0 maps to false
        long num1 = 100L;
        boolean bool1 = (num1 != 0L);

        long num2 = 0L;
        boolean bool2 = (num2 != 0L);

        System.out.println("Long to Boolean Conversion:");
        System.out.println("Original long: " + num1 + " -> Converted to boolean: " + bool1);
        System.out.println("Original long: " + num2 + " -> Converted to boolean: " + bool2);
    }

    static void boolean2float() {
        // Converting from boolean to float - true maps to 1.0, false maps to 0.0
        boolean bool1 = true;
        float num1 = bool1 ? 1.0f : 0.0f;

        boolean bool2 = false;
        float num2 = bool2 ? 1.0f : 0.0f;

        System.out.println("Boolean to Float Conversion:");
        System.out.println("Original boolean: " + bool1 + " -> Converted to float: " + num1);
        System.out.println("Original boolean: " + bool2 + " -> Converted to float: " + num2);
    }

    static void float2boolean() {
        // Converting from float to boolean - non-zero values map to true, 0.0 maps to false
        float num1 = 0.5f;
        boolean bool1 = (num1 != 0.0f);

        float num2 = 0.0f;
        boolean bool2 = (num2 != 0.0f);

        System.out.println("Float to Boolean Conversion:");
        System.out.println("Original float: " + num1 + " -> Converted to boolean: " + bool1);
        System.out.println("Original float: " + num2 + " -> Converted to boolean: " + bool2);
    }

    public static void main(String[] args) {
        boolean2int();
        int2boolean();
        boolean2long();
        long2boolean();
        boolean2float();
        float2boolean();
    }
}
