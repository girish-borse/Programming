interface Animal
{
    void eat();
}
interface pet
{
    void play();
}
class Dog implements Animal
{
    public void eat()
    {
        System.out.println("Dog is eating");
    }
}

class Puppy extends Dog implements pet
{
     public void play()
    {
        System.out.println("Puppy is playing");
    }
}

public class P226_HybridInheritance
{
    public static void main(String[] args)
    {
        Puppy p1 = new Puppy();

        p1.eat();
        p1.play();
    }
}