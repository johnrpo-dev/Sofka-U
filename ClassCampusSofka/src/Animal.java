import java.util.Date;

/**
 * La clase Animal
 */
public class Animal {
    /**
     * Nombre del animal. Ejemplo: Perro, Gato
     */
    public String nameAnimal;
    /**
     * Un nombre propio para cada animal
     */
    public String name;
    /**
     * Nombre científico de la especie
     */
    protected String specie;
    /**
     * La clasifica por tipos. Ejemplo: Aves, Mamíferos, Insectos, etc.
     */
    protected String kind;
    /**
     * La raza del animal
     */
    protected String race;
    /**
     * Fecha de nacimiento del animal
     */
    public Date dateBirthday;
    /**
     * Su peso
     */
    private int height;

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
