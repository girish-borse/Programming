// Check whether Character is a letter AND it is NOT a vowel → consonant
public class P178_StringCountConsonants
{
    public static void main(String[] args)
    {
        String name = "Girish";

        int count = 0;
        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            if(Character.isLetter(ch) && ch != 'a' && ch != 'e'&& ch != 'i'&&ch != 'o'&& ch != 'u')
            {
                count++;
            }  

        }
        System.out.println(count);
    
    }
}