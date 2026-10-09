import java.util.Scanner;

public class P16_CompareNumber
{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int a = sc.nextInt();

    System.out.println("Enter second number: ");
    int b = sc.nextInt();

    if(a > b)
    {
        System.out.println("The number is greater ");
    }
    else
    {
        System.out.println("The number is not greater ");
    }
   }

}