import java.util.ArrayList;

public abstract class Spacecraft implements IPurpose {
    protected String name;
    protected String nationality;
    protected float speed;
    protected int max_speed;
    protected ArrayList<String> fuel;
    protected float weight;
    protected float pushingForce;
    protected float height;
    public boolean isRunning;

    public Spacecraft(String name, String nationality, int max_speed) {
        this.name = name;
        this.nationality = nationality;
        this.max_speed = max_speed;
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSpeed() {
        return "Velocidad: " + speed;
    }
    public float getSpeed2() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public ArrayList<String> getFuel() {
        return fuel;
    }

    public void setFuel(ArrayList<String> fuel) {
        this.fuel = fuel;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPushingForce() {
        return pushingForce;
    }

    public void setPushingForce(float pushingForce) {
        this.pushingForce = pushingForce;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public abstract void accelerate();

    public abstract void brake();

    public void setRunning() {
        if (this.speed > 0){
            isRunning = true;
        }else{
            isRunning = false;
        }
    }

    public void getRunning(){
        if(isRunning)
            System.out.println("Vehículo en marcha");
        else
            System.out.println("Vehículo en reposo");
    }



    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", speed=" + speed +
                ", max_speed=" + max_speed +
                ", fuel=" + fuel +
                ", weight=" + weight +
                ", pushingForce=" + pushingForce +
                ", height=" + height +
                ", isRunning=" + isRunning +
                '}';
    }
}
