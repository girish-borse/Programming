public class P193_StringAnagram
{
    public static void main(String[] args)                   
    {                                                        
        String name1 = "listen";                            
        String name2 = "silent";                             
                                                             
        if(name1.length() != name2.length())                 
        {
            System.out.println("Not anagram");              
        }
        else                                                 
        {
            boolean isAnagram = true;

            for(int i=0; i<name1.length(); i++)             
            {
                int count1 = 0;                            
                int count2 = 0; 

                char ch = name1.charAt(i);                    

                for(int j=0; j<name1.length(); j++)           
                { 
                    if(ch == name1.charAt(j))                 
                    {
                      count1++;
                    }
                    
                }
                for(int j=0; j<name2.length(); j++)
                {
                     if(ch == name2.charAt(j))
                     {
                       count2++;
                     }
                }
                if(count1 != count2)
                {
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram)
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not anagram");
            }
        }

    }
}