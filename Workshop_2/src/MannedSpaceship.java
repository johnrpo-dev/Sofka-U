public class MannedSpaceship extends Spaceship implements IPurpose{

    private int capacity;
    private String purpose;

    public MannedSpaceship(String name, String nationality, int max_speed, int capacity) {
        super(name, nationality, max_speed);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void accelerate() {
        speed += 10;
    }

    @Override
    public void brake() {
        speed -= 10;
    }

    @Override
    public void setRunning() {
        super.setRunning();
    }

    @Override
    public String getPurpose() {
        return purpose;
    }

    @Override
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "MannedSpaceship{" + super.toString() +
                "capacity=" + capacity +
                ", purpose='" + purpose + '\'' +
                "} " ;
    }
}
