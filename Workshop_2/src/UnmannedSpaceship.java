public class UnmannedSpaceship extends Spaceship implements IPurpose{

    private String purpose;
    public UnmannedSpaceship(String name, String nationality, int max_speed) {
        super(name, nationality, max_speed);
    }

    @Override
    public void accelerate() {
        speed += 50;
    }

    @Override
    public void brake() {
        speed -= 50;
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
        return "UnmannedSpacechip{" + super.toString() +
                "purpose='" + purpose + '\'' +
                "} ";
    }
}
