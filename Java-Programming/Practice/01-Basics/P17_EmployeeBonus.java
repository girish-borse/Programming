import java.util.Scanner;

public class P17_EmployeeBonus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of experience: ");
        int experience = sc.nextInt();

        System.out.println("Enter your performance rating: ");
        int rating = sc.nextInt();

        if(experience >= 2 && rating >= 4)
        {
          System.out.println("Bonus eligible");
        }
        else
        {
            System.out.println("Not eligible");
        }
    }
}