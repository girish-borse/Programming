public class P134_LeftRotateBy2
{
    public static void main(String[] args)
    {
        int[] numbers = {10,20,30,40,50};

        int first = numbers[0];
        int second = numbers[1];

        for(int i=0;i<numbers.length-2;i++)
        {
            numbers[i] = numbers[i + 2];
        }
        numbers[numbers.length-2] = first;
        numbers[numbers.length-1] = second;
       
        for(int i=0; i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}