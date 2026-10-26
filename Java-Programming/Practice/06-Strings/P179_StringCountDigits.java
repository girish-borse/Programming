// Count Digits
public class P179_StringCountDigits
{
    public static void main(String[] args)
    {
        String name = "Girish 123";
        int countDigit = 0; 

        for(int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);

            if(Character.isDigit(ch))
            {
                countDigit++;
            }
          
        }
          System.out.println(countDigit);
       
    }
}