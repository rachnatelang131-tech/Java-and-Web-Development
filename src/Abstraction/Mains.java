package Abstraction;

public class Mains {

    public static void main(String[] args) {

        Piano p = new Piano();
        p.play("piano");

        Flute f = new Flute();
        f.play("flute");

        Guitar g = new Guitar();
        g.play("guitar");
    }
}