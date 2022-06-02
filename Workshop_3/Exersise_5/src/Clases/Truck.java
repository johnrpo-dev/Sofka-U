package Clases;

public class Truck extends Vehicle{
    private float height;

    public Truck(String kind, int passengers, int numWheels, String registrationDate, int height) {
        super(kind, passengers, numWheels, registrationDate, "Tierra");
        this.height = height;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                ", height=" + height ;
    }
}
