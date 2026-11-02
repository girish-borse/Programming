class Person
{
    String name ="Girish";

    void showName()
    {
        System.out.println(name);
    }
}
class Student extends Person
{
    int age = 24;
    
    void showAge()
    {
        System.out.println(age);
    }
}

public class P222_InheritanceProperties
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.showName();
        s1.showAge();
    }
}