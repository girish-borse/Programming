public class P113_FindMinEven
{
  public static void main(String[] args)
  {
    int[] numbers = {15,28,43,64,22,51,80,12};
    int min =numbers[1];
    boolean found = false;

    for(int i=0;i<numbers.length;i++)
    {
        if(numbers[i] % 2 == 0 &&(!found || numbers[i] < min) )
        {
            min = numbers[i];
        }
    }
    System.out.println("Minimum even number: " + min);
  }
}