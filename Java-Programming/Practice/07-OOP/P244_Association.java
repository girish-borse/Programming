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
        System.out.println(name + " is examine " + patient.name);
    }   
}

public class P244_Association
{
    public static void main(String[] args)
    {
        Doctor doctor = new Doctor("Dr sharma");

        Patient patient = new Patient("Rahul");

        doctor.examine(patient);
    }
}