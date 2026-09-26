import java.util.Scanner;           // we take this for using Scanner or import scanner class for user input

public class P08_Percentage           // we creates a class that contains our java code
{
    public static void main(String[] args)    //main() is the starting point of from where java executes the program
 {
        Scanner sc = new Scanner(System.in);       // then we create a Scanner for taking input from keyboard

        System.out.println("Enter the Percentage: ");  //then we print this line for asking input from user
        double Percentage = sc.nextDouble();            // take the decimalvalue from user and store it in percentage variable

        System.out.println("Percentage: " + Percentage);  // and print the output
    }
}