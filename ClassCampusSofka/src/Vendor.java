import java.util.Date;

public class Vendor {
    private int id;
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirthday;
    private float height;

    /**
     * Pregunta por la identificación interna del trabajador
     * @return Retorna la identificación del trabajador.
     */
    private int getId() {
        return id;
    }

    /**
     * Configura la identificación del trabajador.
     * @param id Asigna un valor a la identificación.
     */
    private void setId(int id) {
        this.id = id;
    }

    /**
     * Pregunta por el nombre del trabajador.
     * @return Retorna el nombre del trabajador.
     */
    public String getName() {
        return name;
    }

    /**
     * Método que asigna un nombre al trabajador
     * @param name Nombre del trabajador.
     */
    public void setName(String name) {
        this.name = name;
    }
}
