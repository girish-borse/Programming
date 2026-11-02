class Teacher
{
    void Teach()
    {
        System.out.println("Teacher is teaching");
    }
}

class Department
{
    Teacher teacher;

    Department(Teacher teacher)
    {
        this.teacher = teacher;
    }

    void conductClass()
    {
      teacher.Teach();
      System.out.println("Department is conducting class");
    }
}

public class P241_Aggregation
{
    public static void main()
    {
        Teacher teacher = new Teacher();

        Department department = new Department(teacher);

        department.conductClass();
    }
}