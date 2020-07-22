package ClassExample;

public class Showroom {

    void volumeControl()
    {
        System.out.println("voulumeControl() : showroom");
    }

    void settings()
    {
        System.out.println("settings() : showroom");
    }

    void channels()
    {
        System.out.println("channels() : showroom");
    }


    public static void main(String[] args) {

        Showroom s1 = new Onida();

        s1.channels();
        s1.settings();
        s1.volumeControl();

        s1 = new Samsang();
        s1.channels();
        s1.settings();
        s1.volumeControl();

        s1 = new LG();
        s1.channels();
        s1.settings();
        s1.volumeControl();

    }

}


class Onida extends  Showroom
{
    void volumeControl()
    {
        System.out.println("voulumeControl() : onida");
    }

    void settings()
    {
        System.out.println("settings() : onida");
    }

    void channels()
    {
        System.out.println("channels() : onida");
    }
}


class Samsang extends  Showroom
{

    void volumeControl()
    {
        System.out.println("voulumeControl() : samsang");
    }

    void settings()
    {
        System.out.println("settings() : samsang");
    }

    void channels()
    {
        System.out.println("channels() : samsang");
    }

}

class LG extends  Showroom
{
    void volumeControl()
    {
        System.out.println("voulumeControl() : LG");
    }

    void settings()
    {
        System.out.println("settings() : LG");
    }

    void channels()
    {
        System.out.println("channels() : LG");
    }


}
