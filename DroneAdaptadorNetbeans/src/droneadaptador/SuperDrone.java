package droneadaptador;

public class SuperDrone implements Drone {

    @Override
    public void beep() {
        System.out.println("Beep beep!");
    }
    @Override
    public void girarRotor() {
        System.out.println("Girando rotores");
    }
    @Override
    public void despegar() {
        System.out.println("Despegando!");
    }
}