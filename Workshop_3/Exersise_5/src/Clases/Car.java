package Clases;

public class Car extends Vehicle{
    private int num_Doors;

    public Car(String kind, int passengers, String registrationDate, int num_Doors) {
        super(kind, passengers, 4, registrationDate, "Tierra");
        this.num_Doors = num_Doors;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                ", num_Doors=" + num_Doors;
    }
}
