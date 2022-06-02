package clases;

/**
 * Clase Planeta que adjunta y crea los datos
 */
public class Planet {
    private final int id;
    private String name;
    private double mass;
    private double density;
    private double Diameter;
    private double averageDistanceSun;

    /**
     *
     * @param id
     * @param name nombre
     * @param mass masa
     * @param averageDistanceSun distancia al Sol
     */
    public Planet(int id, String name, double mass, double averageDistanceSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.averageDistanceSun = averageDistanceSun;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return Diameter;
    }

    public void setDiameter(double diameter) {
        Diameter = diameter;
    }

    public double getAverageDistanceSun() {
        return averageDistanceSun;
    }

    public void setAverageDistanceSun(double averageDistanceSun) {
        this.averageDistanceSun = averageDistanceSun;
    }


}
