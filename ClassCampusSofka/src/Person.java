import java.util.Date;

/**
 *  Representa la clase persona.
 */
public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirthday;

    /**
     * Método que pide el name
     * @return Retorna el name
     */
    public String getName() {
        return name;
    }

    /**
     * Método que asigna un name
     * @param name Name asignado
     */
    public void setName(String name) {
        this.name = name;
    }
}

