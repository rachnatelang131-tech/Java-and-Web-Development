package Abstraction;

public class Guitar extends Instrument {

    @Override
    public void play(String msg) {
        msg = "guitar is playing tin tin tin tin";
        System.out.println(msg);
    }
}