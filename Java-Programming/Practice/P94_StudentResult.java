public class P94_StudentResult
{
    static int calculateTotal(int marks1, int marks2, int marks3)
    {
      return marks1+marks2+marks3;
    }
    static double calculateAverage(int total)
    {
        double result = total;
         return result / 3.0;

    }
    static String checkResult(double average)
    {
        if(average >= 40)
        {
            return "pass";
        }
        else
        {
            return "fail";
        }
        
    }
    public static void main(String[] args)
    {
       int total = calculateTotal(70,80,90);
       double average = calculateAverage(total);
       String result = checkResult(average);

       System.out.println("total: " + total);
       System.out.println("average: " + average);
       System.out.println("Result: " + result);
    }
}