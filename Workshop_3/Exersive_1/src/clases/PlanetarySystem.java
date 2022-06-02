package clases;

import java.util.Random;

/**
 * Almacena dos comportamientos y el atributo random para un angulo aleatorio
 */
public class PlanetarySystem {
    /**
     * Crea una nueva instancia Random para calcular un angulo aleatorio
     */
    static Random random = new Random();
    private final int id;
    private final String name;
    /**
     * Constante de gravitación universal
     */
    private static final double Cavendish = 6.67730e+11;
    /**
     * Saca un ángulo aleatorio entre 0 y 360°
     */
    private static final double radians = random.nextInt(360);

    public static double getRadians() {
        return radians;
    }

    /**
     * Constructor de la clase Sistema Planetario
     * @param id
     * @param name nombre
     */
    public PlanetarySystem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Método que calcula la distancia de los planetas de acuerdo a la ley de los cosenos
     * @param radius Radio del planeta 1
     * @param radius1 Radio del planeta 2
     * @return Distancia calculada con la ley de cosenos
     */
    public Double defineDistanceBetweenPlanets(double radius, double radius1){
        return Math.sqrt(Math.pow(radius,2)+Math.pow(radius1,2)-(2*radius*radius1*Math.cos(Math.toRadians(radians))));
    }

    /**
     * Método para hallar la Ley de Gravitación Universal
     * @param planet Planeta 1
     * @param planet1 Planeta 2
     * @return Un String con la fuerza de atracción entre los dos planetas ya calculada
     */
    public String getGravitationalPull(Planet planet, Planet planet1){
        double force = Cavendish*((planet.getMass()*planet1.getMass())
                /Math.pow(defineDistanceBetweenPlanets(planet.getAverageDistanceSun(),planet1.getAverageDistanceSun()),2));
        return "La fuerza gravitacional entre: " + planet.getName() + " y " + planet1.getName() + " es de " + force + " Newtons";
    }
}
