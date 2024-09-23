import java.lang.Math;

public class FlowOfPrograms01 {
    public static boolean problem01(int n)
    {
        if (n % 4==0 )
        {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.printf("%d is a leap year \n", n);
                    return true;
                }
                else {
                    System.out.printf("%d is not a leap year \n", n);
                    return false;
                }
            } else {
                System.out.printf("%d is a leap year \n", n);
                return true;
            }
        }
        else
        {
            System.out.printf("%d is not a leap year \n", n);
            return false;
        }

    }
    public static void problem02(int n, int m)
    {
        int sum = n +m ;
        System.out.printf("The sum of both numbers is %d \n",sum);
    }
    public static void problem03(int n)
    {
        System.out.printf("The multiplication table of %d till 20.",n);
        for (int x = 1;  x < 21; x++)
        {
            System.out.printf( "%d * %d = %d \n",n,x,n*x);
        }

    }
    public static void problem04(int n, int m)
    {
        int num = Math.max(n,m);
        int HCF ;
        int LCM;
        while (num > 0 )
        {
            if ( m % num ==0 && n % num ==0)
            {
                HCF = num;
                System.out.printf("The HCF is %d \n",HCF);
                LCM = (n*m)/HCF;
                System.out.printf("The LCM is %d \n",LCM);
                break;
            }
            num--;
        }
    }
    public static void problem05()
    {

    }


    public static void main(String[] args) {
//        problem01(2024);System.out.println();
//        problem02(2000,24);System.out.println();
//        problem03(30);System.out.println();
//        problem04(30,40);System.out.println();
        problem05();System.out.println();
    }
}
