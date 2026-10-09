import java.util.Scanner;

public class P19_LargestNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        if(a >= b && a >= c)
        {
           System.out.println("A is grater");
        }
        else if(b >= a && b >= c)
        {
            System.out.println("B is greater");
        }
        else
        {
            System.out.println("C is the largest");
        }
    }
}