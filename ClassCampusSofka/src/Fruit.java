import java.util.ArrayList;

/**
 * Representa la clase Fruit
 */
public class Fruit {
    public String name;
    private Float averageWeight;
    /**
     * Esta lista determina los colores de la fruta
     */
    public ArrayList<String> colors;

    /**
     * Pide los colores de la fruta
     * @return Retorna dichos colores
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Configura los colores de la fruta
     * @param name Asigna e indexa los colores de la fruta
     */
    public void setColors(String name) {
        this.colors.add(name);
    }
}
