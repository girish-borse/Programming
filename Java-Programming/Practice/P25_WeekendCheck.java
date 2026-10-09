import java.util.Scanner;

public class P25_WeekendCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int day = sc.nextInt();

        if(day == 6 || day == 7)
        {
            System.out.println("Weekend");
        }
        else
        {
            System.out.println("Weekday");
        }
    }
}