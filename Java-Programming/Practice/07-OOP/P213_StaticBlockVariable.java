class Student
{
    static String collage;

    static
    {
      collage ="ABC collage";
    }
}
public class P213_StaticBlockVariable
{
    public static void main(String[] args)
    {
        System.out.println(Student.collage);
    }
}