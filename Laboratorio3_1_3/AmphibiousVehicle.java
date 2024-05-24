// Clase AmphibiousVehicle
class AmphibiousVehicle extends Vehicle implements LandVehicle, WaterVehicle {

    public AmphibiousVehicle(String name) {
        super(name);
    }

    @Override
    public void accelerate() {
        System.out.println(getName() + " is accelerating.");
    }

    @Override
    public void driveOnLand() {
        System.out.println(getName() + " is driving on land.");
    }

    @Override
    public void sailOnWater() {
        System.out.println(getName() + " is sailing on water.");
    }
}
