package Abstraction;

public class Piano extends Instrument {

    @Override
    public void play(String msg) {
        msg = "piano is playing taan tan tan tan";
        System.out.println(msg);
    }
}