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
    Teacher teacher1;
    Teacher teacher2;

    Department(Teacher teacher1, Teacher teacher2)
    {
        this.teacher1 = teacher1;
        this.teacher2 = teacher2;
    }

    void conductClass()
    {
        teacher1.teach();
        teacher2.teach();

        System.out.println("Department is conducting classes");
    }
}

public class P242_AggregationMultiple
{
    public static void main(String[] args)
    {
        Teacher teacher1 = new Teacher("Rahul");
        Teacher teacher2 = new Teacher("Priya");

        Department department = new Department(teacher1, teacher2);

        department.conductClass();
    }
}