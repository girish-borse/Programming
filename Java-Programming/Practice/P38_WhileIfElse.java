import java.util.Scanner;

public class P38_WhileIfElse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int i = 1;
        while(i<= number)
        {
            if(i % 2 == 0 )
            {
                System.out.println("Even: " + i);
            }
            else
            {
                System.out.println("Odd: " + i);
            }
            i++;
        }
    }
}
