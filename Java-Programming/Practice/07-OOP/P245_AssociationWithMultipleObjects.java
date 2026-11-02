class Patient
{
    String name;

    Patient(String name)
    {
       this.name = name;
    }
}

class Doctor
{
    String name;

    Doctor(String name)
    {
        this.name = name;
    }

    void examine(Patient patient)
    {
        System.out.println(name + " is examinig " + patient.name);
    }
}

public class P245_AssociationWithMultipleObjects
{
  public static void main(String[] args)
  {
    Doctor doctor = new Doctor("Dr sharma");

    Patient patient1 = new Patient("Rahul");
    Patient patient2 = new Patient("Priya");
    Patient patient3 = new Patient("Amit");

    doctor.examine(patient1);
    doctor.examine(patient2);
    doctor.examine(patient3);

    
  }
}