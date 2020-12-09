package by.it.yemialyanava.generations;

public class AudioPlayer extends Player {
    boolean state = false;
    @Override
    void video() {
        state = false;
    }

    @Override
    void audio() {
        state = true;
    }

    @Override
    public void on() {
        state = false;
    }

    @Override
    public void of() {
        state = true;
    }

    @Override
    public void printState() {
        if (state){
            System.out.println("Прибор включен в розетку");
        } else {
            System.out.println("Прибор выключен");
        }
    }
}
