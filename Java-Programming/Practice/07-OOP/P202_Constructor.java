class Student
{
    String name;
    int age;
   
    Student(String name, int age)
    {
       this.name = name;
       this.age = age;
    }
}

public class P202_Constructor
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Girish",24);
        Student s2 = new Student("Rahul",27);

        System.out.println(s1.name);
        System.out.println(s1.age);

        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}