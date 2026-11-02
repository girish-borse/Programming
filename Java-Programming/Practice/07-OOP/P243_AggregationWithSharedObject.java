class Teacher
{
   String name;

   Teacher(String name)
   {
    this.name = name;
   }

   void teach()
   {
     System.out.println(name + " is teaching");
   }
}

class Department
{
    String name;
    Teacher teacher;

    Department(String name, Teacher teacher)
    {
        this.name = name;
        this.teacher = teacher;
    }

    void conductClass()
    {
        System.out.println(name + " Class is ongoing");
        teacher.teach();
    }
}

public class P243_AggregationWithSharedObject
{
    public static void main(String[] args)
    {
        Teacher teacher = new Teacher("Rahul");

        Department department1 = new Department("Computer science", teacher);
        Department department2 = new Department("Information technology", teacher);

        department1.conductClass();
        department2.conductClass();
    }
}