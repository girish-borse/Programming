class Student
{
    String name;

    Student()
    {
      this("unknown");
    }
    Student(String name)
    {
        this.name = name;
    }
}

public class P206_ThisConstructor
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Girish");

        System.out.println(s1.name);
         System.out.println(s2.name);
    }
}
