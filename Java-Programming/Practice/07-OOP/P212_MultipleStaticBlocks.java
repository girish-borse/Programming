class Student
{
    static
    {
        System.out.println("Static block 1");
    }

    static 
    {
        System.out.println("Static block 2");
    }
}
public class P212_MultipleStaticBlocks
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
    }
}