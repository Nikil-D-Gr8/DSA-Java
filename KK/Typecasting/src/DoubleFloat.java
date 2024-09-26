public class DoubleFloat{
//    double takes 8 bytes ( 1 bit for sign, 11 bits for exponent and 52 bits for mantissa ) while
//    float takes only 4 bytes( 1 bit for sign, 8 bits for exponent and 23 bits for mantissa )
    static void double2float()
    {
//        The decimals are stored as double by default
        double num1 =1.123456789;
        float numb1 = (float)(num1);

        double num2 = -1.123456789;
        float numb2 = (float)(num1);
//  Mantissa is what talks about the significant digits so 2^23 is the precision for float and 2^52 for double
        System.out.println(numb1);
        System.out.println(numb2);
//  the signs don't affect the precision because they have their own space
    }
    static void float2double()
    {
        float num1 = 1.12345678f;
        double numb1 = num1;
        float num2 = -1.12345678f;
        double numb2 = num2;
//  the number is rounded to the closest representable with float hence the error in printing
        System.out.println(numb1);
        System.out.println(numb2);
    }

    public static void main(String[] args) {
        double2float();
        float2double();
    }
}



