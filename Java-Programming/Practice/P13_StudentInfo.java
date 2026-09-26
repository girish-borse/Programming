import java.util.Scanner;

public class P13_StudentInfo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("Enter your grade: ");
        char grade = sc.next().charAt(0);         

        System.out.println("-------Student Information-------");
        System.out.println(name);
        System.out.println(age);
        System.out.println(percentage);
        System.out.println(grade);


    }
}