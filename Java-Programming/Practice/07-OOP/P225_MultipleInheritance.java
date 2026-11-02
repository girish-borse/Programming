interface Camera
{
    void takePhoto();

}

interface MusicPlayer
{
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer
{
    public void takePhoto()
    {
        System.out.println("taking photo");
    } 
    public void playMusic()
    {
        System.out.println("Playing music");
    }
}

public class P225_MultipleInheritance
{
    public static void main(String[] args)
    {
        Smartphone s1 = new Smartphone();

        s1.takePhoto();
        s1.playMusic();
    }
}