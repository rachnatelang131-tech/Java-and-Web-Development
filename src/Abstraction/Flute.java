package Abstraction;

public class Flute extends Instrument {

    @Override
    public void play(String msg) {
        msg = "flute is playing toot toot toot";
        System.out.println(msg);
    }
}