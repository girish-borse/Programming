import java.util.Scanner;

public class P35_WhileLoopInputSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int i = 1;
        int sum = 0;

        while(i <= number)
        {
            sum = sum + i;
            ++i;    
        }
        System.out.println("Sum is: " + sum);
    }
}