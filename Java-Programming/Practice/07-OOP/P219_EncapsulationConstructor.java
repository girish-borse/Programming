class Student
{
    private String name;
    private int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
}
public class P219_EncapsulationConstructor
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Girish",24);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());

     
    }
}