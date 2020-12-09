package by.it.yemialyanava.generations;

public class VideoPlayer extends Player {
    boolean state = false;

    @Override
    void video() {
        this.state = true;
    }

    @Override
    void audio() {
        this.state = true;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void of() {
        this.state = false;
    }

    @Override
    public void printState() {
        if (state){
            System.out.println("Прибор включен в розетку");
        } else {
            System.out.println("ПРибор выключен");
        }
    }
}
