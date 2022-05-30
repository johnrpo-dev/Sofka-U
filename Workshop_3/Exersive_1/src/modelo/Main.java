package modelo;

import clases.Planet;
import clases.PlanetarySystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PlanetarySystem sys1 = new PlanetarySystem(1, "Canis Mayoris");
        Planet planet = new Planet(1,"Kaliope",5.86e+24,7.3e+6);
        Planet planet2 = new Planet(2,"Adonis",8.86e+26,8.5e+6);
        System.out.println(PlanetarySystem.getRadians());
        System.out.println(sys1.defineDistanceBetweenPlanets(planet.getAverageDistanceSun(),planet2.getAverageDistanceSun()));
        String pull = sys1.getGravitationalPull(planet, planet2);
        System.out.println(pull);
    }
}
