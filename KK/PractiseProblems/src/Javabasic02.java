import java.util.Scanner;

public class Javabasic02 {
    public static void problem01()
    {
        System.out.println("Input a number to check if its odd or even");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("The given number is even");
        }
        else
        {
            System.out.println("The given number is odd");
        }
    }
    public static void problem02()
    {
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Hello "+name +"! \n");
    }
    public static void problem03()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input Principal, Time and Rate in order :");
        System.out.print("The Principal : ");
        int principal = input.nextInt();
        System.out.print("\nThe Time : ");
        int time = input.nextInt();
        System.out.print("\nThe Rate : ");
        int rate = input.nextInt();
        System.out.println();
        int interest= (principal*time*rate)/100;
        System.out.println("The Simple Interest is :" + interest );
    }
    public static void problem04()
    {
        System.out.println("Give two number to calculate:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Please give the operation for the two numbers:");
        System.out.println("Choose only '+' , '-' , '*' , '/' .");
        String oper = input.next();
        switch (oper) {
            case ("+"): {
                int sum = num1 + num2;
                System.out.print("The sum is :" + sum);
                break;
            }
            case ("-"): {
                int sub = num1 - num2;
                System.out.print("The sub is :" + sub);
                break;
            }
            case ("*"): {
                int mul = num1 * num2;
                System.out.print("The mul is :" + mul);
                break;
            }
            case ("/"): {
                float div = num1 / num2;
                System.out.print("The div is :" + div);
                break;
            }
            default :
            {
                System.out.println("input a valid operation");
            }
        }
    }



    public static void main(String[] args) {
//        problem01();System.out.println();
//        problem02();System.out.println();
//        problem03();System.out.println();
        problem04();System.out.println();
//        problem05();System.out.println();
//        problem06();System.out.println();
//        problem07();System.out.println();
//        problem08();System.out.println();
//        problem09();System.out.println();
//

    }
}
