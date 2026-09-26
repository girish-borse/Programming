import java.util.Scanner;

public class P07_NameInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name: ");

        String name = sc.nextLine();
        System.out.println("Your name is: " + name);


    }
}