public abstract class Spaceship extends Spacecraft {
    protected float orbit;
    protected float distanceEarth;
    protected boolean outOrbit;

    public Spaceship(String name, String nationality, int max_speed) {
        super(name, nationality, max_speed);
    }

    public float getOrbit() {
        return orbit;
    }

    public void setOrbit(float orbit) {
        this.orbit = orbit;
    }

    public float getDistanceEarth() {
        return distanceEarth;
    }

    public void setDistanceEarth(float distanceEarth) {
        this.distanceEarth = distanceEarth;
    }

    public boolean isOutOrbit() {
        return outOrbit;
    }

    public void setOutOrbit(boolean outOrbit) {
        this.outOrbit = outOrbit;
    }

    @Override
    public abstract void accelerate();

    @Override
    public abstract void brake();

    @Override
    public String toString() {
        return super.toString() +
                "orbit=" + orbit +
                ", distanceEarth=" + distanceEarth +
                ", outOrbit=" + outOrbit +
                "} " ;
    }
}
