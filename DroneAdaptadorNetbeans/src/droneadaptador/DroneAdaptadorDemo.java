package droneadaptador;

public class DroneAdaptadorDemo {
    public static void main(String[] args) {
        SuperDrone superDrone = new SuperDrone();
        AdaptadorDrone adaptadorDrone = new AdaptadorDrone(superDrone);
        
        System.out.println("El dron hace...");
        superDrone.beep();
        superDrone.despegar();
        System.out.println("\nEl Adaptador hace...");
        testPato(adaptadorDrone);
    }
        static void testPato(Pato pato) {
            pato.cuaquear();
            pato.volar();
        }

}