abstract class Animal
{
    void eat()
    {
      System.out.println("Animal is eating");
    }

    abstract void sound();
}

interface Pet 
{
    void play();
}

class Dog extends Animal implements Pet
{
   void sound()
   {
    System.out.println("Dog barks");
   }

   public void play()
   {
    System.out.println("Dog is playing");
   }
}

public class P237_AbstractVsInterface
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();

        d1.eat();
        d1.sound();
        d1.play();

    }
}