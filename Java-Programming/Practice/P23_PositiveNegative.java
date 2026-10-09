import java.util.Scanner;

public class P23_PositiveNegative {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number");
    
         int number = sc.nextInt();

         boolean positive = number > 0;

         if(positive)
         {
            System.out.println("Number is positive");
         }
         else
         {
            System.out.println("Number is negative");
         }


    }
}
