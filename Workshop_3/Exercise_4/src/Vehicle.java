public class Vehicle {
    private int id = 0;
    private final String kind;
    private final int passengers;
    private boolean crew;
    private final int numWheels;
    private final String registrationDate;
    private final String medium;

    public Vehicle(String kind, int passengers, int numWheels, String registrationDate, String medium) {
        this.id = id++;
        this.kind = kind;
        this.passengers = passengers;
        this.numWheels = numWheels;
        this.registrationDate = registrationDate;
        this.medium = medium;
    }

    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return  "\nid= " + id +
                ", kind= " + kind +
                ", passengers= " + passengers +
                ", crew= " + crew +
                ", numWheels= " + numWheels +
                ", registrationDate= " + registrationDate +
                ", medium= " + medium;
    }
}
