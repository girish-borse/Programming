class Engine
{
   void start()
   {
        System.out.println("Engine starts");
   }
}
class Musicsystem
{
    void playMusic()
    {
        System.out.println("Music is playing");
    }
}
class Car
{
    Engine engine = new Engine();
    Musicsystem Musicsystem = new Musicsystem();

    void drive()
    {
        engine.start();
        Musicsystem.playMusic();

        System.out.println("Car is driving");
    }
}

public class P239_CompositionMultiple
{
    public static void main(String[] args)
    {
        Car car = new Car();

        car.drive();
    }
}