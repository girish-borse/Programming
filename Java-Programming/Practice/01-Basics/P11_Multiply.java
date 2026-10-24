import java.util.Scanner;

public class P11_Multiply
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second number: ");
        int b = sc.nextInt();

        System.out.println("Multiplication is: " + (a * b));
    }
}