import java.util.Scanner;

public class P20_NestedEligibility
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your percentage: ");
        double percentage = sc.nextDouble();

        if(age >= 18)
        {
            if(percentage >= 60)
            {
                System.out.println("Eligible");
            }
            else
            {
                System.out.println("Percentage is too low");
            }
        }
        else
        {
          System.out.println("Age requirement not met");
        }
    }
}