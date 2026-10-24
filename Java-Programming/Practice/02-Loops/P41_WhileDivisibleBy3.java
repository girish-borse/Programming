import java.util.Scanner;

public class P41_WhileDivisibleBy3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int i = 1;

        while(i<= number)
        {
            if(i % 3 == 0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}