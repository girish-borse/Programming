public class P172_StringSplit
{
    public static void main(String[] args)
    {
        String name = "Java is easy";

        String[] words = name.split(" ");

        for(int i=0; i<words.length; i++)
        {
            System.out.println(words[i]);
        }
       
    }
}