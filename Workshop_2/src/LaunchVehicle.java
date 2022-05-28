public class LaunchVehicle extends Spacecraft{

    private float init_speed;

    public LaunchVehicle(String name, String nationality, int max_speed) {
        super(name, nationality, max_speed);
    }

    public float getInit_speed() {
        return init_speed;
    }

    public void setInit_speed(float init_speed) {
        this.init_speed = init_speed;
    }

    @Override
    public void accelerate() {
        speed += 100;
    }

    @Override
    public void brake() {
        speed -= 100;
    }

    @Override
    public void setRunning() {
        super.setRunning();
    }

    @Override
    public String toString() {
        return "LaunchVehicle{" + super.toString() +
                "init_speed=" + init_speed +
                "} " ;
    }

    @Override
    public void setPurpose(String value) {

    }

    @Override
    public String getPurpose() {
        return null;
    }
}
