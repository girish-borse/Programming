public class P133_RightRotateArray
{
    public static void main(String[] args)
    {
       int[] numbers = {10,20,30,40,50};
       int last = numbers[4];

    for(int i=numbers.length-1;i>=1;i--)
    {
      numbers[i] = numbers[i-1];
    }
      numbers[0] = last;

      for(int i=0; i<numbers.length;i++)
      {
        System.out.println(numbers[i]);
      }
    }
    
   

}