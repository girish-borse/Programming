public class P199_StringRotation
{
    public static void main(String[] args)
    {
        String name1 = "abcd";
        String name2 = "acbd";

        if(name1.length() != name2.length())
        {
            System.out.println("Not Rotation");
        }
        else
        {
            boolean isRotation = false;
            if((name1 + name1).contains(name2))
            {
                isRotation = true;
            }
            if(isRotation)
            {
                System.out.println("Rotation");
            }
            else
            {
                System.out.println("Not rotation");
            }

        }
    }
}