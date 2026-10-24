import java.util.Scanner;

public class P12_EmployeeStatus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you a fulltime employee?: ");
        boolean employee = sc.nextBoolean();

        System.out.println("Full time employee: " + employee);

    }
}