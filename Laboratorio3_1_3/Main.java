// Clase de prueba Main
public class Main {
    public static void main(String[] args) {
        AmphibiousVehicle amphibiousVehicle = new AmphibiousVehicle("AmphiCar");

        amphibiousVehicle.start();
        amphibiousVehicle.driveOnLand();
        amphibiousVehicle.sailOnWater();
        amphibiousVehicle.accelerate();
        amphibiousVehicle.stop();
    }
}
