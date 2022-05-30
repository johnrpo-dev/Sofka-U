package clases;

import java.util.Random;

public class PlanetarySystem {
    static Random random = new Random();
    private final int id;
    private final String name;
    private static final double Cavendish = 6.67730e+11;
    private static final double radians = random.nextInt(360);

    public static double getRadians() {
        return radians;
    }

    public PlanetarySystem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Double defineDistanceBetweenPlanets(double radius, double radius1){
        return Math.sqrt(Math.pow(radius,2)+Math.pow(radius1,2)-(2*radius*radius1*Math.cos(Math.toRadians(radians))));
    }

    public String getGravitationalPull(Planet planet, Planet planet1){
        double force = Cavendish*((planet.getMass()*planet1.getMass())
                /Math.pow(defineDistanceBetweenPlanets(planet.getAverageDistanceSun(),planet1.getAverageDistanceSun()),2));
        return "La fuerza gravitacional entre: " + planet.getName() + " y " + planet1.getName() + " es de " + force + " Newtons";
    }
}
