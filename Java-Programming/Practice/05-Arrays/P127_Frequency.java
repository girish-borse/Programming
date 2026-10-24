public class P127_Frequency
{
    public static void main(String[] args)
    {
        int[] numbers ={10,20,30,20,40,10};
        int search = 20;
        int count = 0;

        for(int i=0; i<numbers.length;i++)
        {
            if(numbers[i] == search)
            {
                count++;
            }
        }
        System.out.println(search + " appears " + count + " times ");
    }
}