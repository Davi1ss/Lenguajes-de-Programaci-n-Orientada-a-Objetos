// Clase abstracta Vehicle
abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println(name + " is starting.");
    }

    public void stop() {
        System.out.println(name + " is stopping.");
    }

    public abstract void accelerate();
}
