public class P186_StringLastOccurance
{
    public static void main(String[] args)
    {
        String name = "Programming";
        int index = 0;

        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            if(ch == 'g')
            {
                index = i;
            }
        }
        System.out.println(index);
    }
}