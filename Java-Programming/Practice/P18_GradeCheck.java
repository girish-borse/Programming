import java.util.Scanner;

public class P18_GradeCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        double marks = sc.nextDouble();

        if(marks >= 90)
        {
            System.out.println('A');
        }
        else if(marks >= 75)
        {
            System.out.println('B');
        }
        else if(marks >= 50)
        {
            System.out.println('C');
        }
        else
        {
            System.out.println("Fail");
        }
    }
}