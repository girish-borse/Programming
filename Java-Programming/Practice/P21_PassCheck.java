import java.util.Scanner;

public class P21_PassCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks:");
        double marks = sc.nextDouble();


        boolean passed = marks >= 40;  // stores the value in boolean data type variable(passed)...true or false...if marks is greater true else false
                                    //  else false       also refer notes for this 
        
        if(passed)
        {
            System.out.println("passed: " + (passed));
        }
        else
        {
           System.out.println("Passed: " + (passed));
          
        }
     
    }
}