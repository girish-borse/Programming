class Engine
{
   void start()
   {
      System.out.println("Engine Starts");
   }
}

class MusicSystem
{
    void playMusic()
    {
        System.out.println("Music is playing");
    }
}

class Car
{
    Engine engine;
    MusicSystem musicSystem;

    Car(Engine engine, MusicSystem musicSystem)
    {
        this.engine = engine;
        this.musicSystem = musicSystem;
    }
    void drive()
    {
        engine.start();
        musicSystem.playMusic();

        System.out.println("Car is driving");
    }
}

public class P240_CompositionConstructor
{
    public static void main(String[] args)
    {
        Engine engine = new Engine();
        MusicSystem musicSystem = new MusicSystem();
        
        Car car = new Car(engine, musicSystem);

        car.drive();
    }
}