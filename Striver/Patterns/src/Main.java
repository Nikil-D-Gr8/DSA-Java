public class Main{

    public static void printpattern01(int n)
    {

        for( int x = 0; x < n ; x ++)
        {
            for (int y = 0; y < n ; y ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void printpattern02( int n )
    {
        for ( int x = 0 ; x < n ; x ++)
        {
            for ( int y = 0 ; y < x ; y ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printpattern03(int n)
    {
        for ( int x = 1 ; x <= n ; x ++)
        {
            for ( int y = 1 ; y <= x ; y ++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
    public static void printpattern04(int n)
    {
        for ( int x = 1 ; x <= n ; x ++)
        {
            for ( int y = 1 ; y <= x ; y ++)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
    public static void printpattern05( int n)
    {
        for (int x = 0; x <= n; x ++)
        {
            for (int y = 0 ; y <= (n-x) ; y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printpattern06( int n )
    {
        for (int x = 1; x <= n; x ++)
        {
            for (int y = 1 ; y <= (n-x) ; y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
    public static void printpattern07( int n)
    {
        for (int x = 0; x < n ; x ++)
        {
//          code for space
            for (int i = 0; i < n - 1 - x ; i ++)
            {
                System.out.print(" ");
            }
//          code for star
            for (int j = 0; j < (2 * x) + 1 ; j++)
            {
                System.out.print("*");
            }
//          code for space
            for (int i = 0; i < n - 1 - x ; i ++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printpattern08a(int n)
    {
//        we used the reverse of the above
        for (int x = n; x >= 0 ; x --)
        {
//          code for space
            for (int i = 0; i < n - 1 - x ; i ++)
            {
                System.out.print(" ");
            }
//          code for star
            for (int j = 0; j < (2 * x) + 1 ; j++)
            {
                System.out.print("*");
            }
//          code for space
            for (int i = 0; i < n - 1 - x ; i ++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printpattern08b(int n)
    {
//        we are using the counting each pattern and creating it approach here
        for ( int x = 0 ; x <= n ; x ++)
        {
//            for spaces
            for (int i = 0;  i < x ; i ++)
            {
                System.out.print(" ");
            }
//            for stars
            for (int j = 0; j < 2*(n-x)+1; j ++)
            {
                System.out.print("*");
            }
//            for spaces
            for (int i = 0;  i < x ; i ++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printpattern09 ( int n)
    {
//        top loop
        for (int x = 0; x < n ; x ++)
        {
//          code for space
            for (int i = 0; i < n - 1 - x ; i ++)
            {
                System.out.print(" ");
            }
//          code for star
            for (int j = 0; j < (2 * x) + 1 ; j++)
            {
                System.out.print("*");
            }
//          code for space
            for (int i = 0; i < n - 1 - x ; i ++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
//        bottom loop
        for ( int x = 0 ; x < n ; x ++)
        {
//            for spaces
            for (int i = 0;  i < x ; i ++)
            {
                System.out.print(" ");
            }
//            for stars
            for (int j = 0; j < 2*(n-x)-1; j ++)
            {
                System.out.print("*");
            }
//            for spaces
            for (int i = 0;  i < x ; i ++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printpattern10a( int n )
    {
        for ( int x = 1; x <= n ; x ++)
        {
//            for top starts
            for (int i = 0;i < x; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = n - 1; x > 0; x--) {
            // Inner loop prints 'x' stars
            for (int i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

    }
    public static void printpattern10b( int n)
    {
        for (int x = 0; x< 2*n - 1 ; x++)
        {
            if (x < n)
            {
                for (int i = 0;i <= x;i++)
                {
                    System.out.print("*");
                }
                System.out.println();

            }
            else
            {
                for (int j = 0;j <2*n-1-x;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    public static void printpattern11( int n)
    {
        for (int x = 0; x< n ; x ++)
        {
            int start = 1;
            if (x % 2 ==0)
            {
                start=0;

            }
            for (int i =0 ; i<x;i++)
            {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();

        }
    }
    public static void printpattern12 (int n)
    {
        for ( int x = 1; x<n; x++)
        {
//            left stuff
            for (int i = 1;i<=x;i++)
            {
                System.out.print(i);
            }
//            middle thingy
            for (int y = 1; y <2*(n -x);y++)
            {
                System.out.print("0");
            }
//            end thingy
            for (int i = x;i>0;i--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void printpattern13( int n)
    {
        int count = 1;
        for (int x = 0; x < n ; x ++)
        {
            for (int i = 0 ; i <=x;i++)
            {
                System.out.print(count);
                count +=1;
            }
            System.out.println();
        }
    }
    public static void printpattern14a(int n)
    {

        for (int x = 0; x < n ; x ++)
        {
            char letter = 'A';
            for (int i = 0 ; i <=x;i++)
            {
                System.out.print(letter);
                letter +=1;
            }
            System.out.println();
        }
    }
    public static void printpattern14b(int n)
    {
        for (int x = 0; x <n ; x++)
        {
           for ( char y = 'A';y < 'A'+x;y++)
           {
               System.out.print(y);
           }
            System.out.println();
        }
    }
    public static void printpattern15(int n)
    {
        for ( int x =n; x > 0; x --)
        {
            for (char i ='A'; i<'A'+x ;i++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
    public static void printpattern16(int n)
    {
        char y ='A';
        for (int x = 0; x<n; x++)
        {
            for (int i =0; i<= x; i++)
            {
                System.out.print(y);
            }
            System.out.println();
            y += 1;
        }
    }
    public static void printpattern17a(int n)
    {
        for (int x = 0; x < n; x++) {
            // Left space
            for (int i = 0; i < n - x; i++) {
                System.out.print("0");
            }

            // Center-left (A to middle)
            for (int j = 0; j <= x; j++) {
                System.out.print((char) ('A' + j));
            }

            // Center-right (middle - 1 to A)
            for (int j = x - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }

            // Right space
            for (int i = 0; i < n - x; i++) {
                System.out.print("0");
            }

            // Move to the next line
            System.out.println();
        }
    }
    public static void printpattern17b(int n)
    {

        for (int x = 0; x < n ; x ++)
        {
//          code for space
            for (int i = 0; i < n - 1 - x ; i ++)
            {
                System.out.print(" ");
            }
//          code for letter
            char letter = 'A';
            for (int j = 0; j < (2 * x) + 1 ; j++)
            {
                System.out.print(letter);
                if (j<x)
                {
                    letter++;
                }
                else
                {
                    letter --;
                }
            }
//          code for space
            for (int i = 0; i < n - 1 - x ; i ++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printpattern18( int n)
    {
        for (int x = 0; x < n; x++) {
            for (char al = (char)('E' - x); al <= 'E'; al++) {
                System.out.print(al);
            }
            System.out.println();
        }
    }
    public static void printpattern19( int n )
    {
//        top part
        for (int x =0; x <n;x++)
        {
//            left triangle
            for (int i =0; i<n-x;i++)
            {
                System.out.print("*");
            }
//            middle empty
            for (int j=0; j<2*x; j++)
            {
                System.out.print(" ");
            }
//            right triangle
            for (int i =0; i<n-x;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //        Bottom part
        for (int x =n; x >=0;x--)
        {
//            left triangle
            for (int i =0; i<n-x;i++)
            {
                System.out.print("*");
            }
//            middle empty
            for (int j=0; j<2*x; j++)
            {
                System.out.print(" ");
            }
//            right triangle
            for (int i =0; i<n-x;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printpattern20 ( int n)
    {
//top part
        for (int x =0; x < n; x++)
        {
            for (int i = 0; i <= x; i++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (n - x) - 1; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= x; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
//bottom part
        for (int y = n; y > 0; y--)
        {
            for (int i = 0; i <= y; i++)
            {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (n - y) - 1; j++)
            {
                System.out.print(" ");
            }
            for (int i = 0; i <= y; i++)
            {
                System.out.print("*");
            }
            System.out.println();

        }


}
    public static void printpattern21 (int n)
    {
        for ( int x=0; x <n; x ++)
        {
            for (int y=0 ; y <n ; y++)
            {
                if ( x == 0 || y ==0 || x == n-1 || y == n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
        {
            printpattern21(5);
        }
}
