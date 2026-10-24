import java.util.Scanner;

public class P24_StudentEligibility
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter the percentage: ");
        double percentage = sc.nextDouble();

        if(age >= 18 && percentage >= 60)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
}