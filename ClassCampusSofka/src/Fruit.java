import java.util.ArrayList;

public class Fruit {
    public String name;
    private Float averageWeight;
    public ArrayList<String> colors;

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(String name) {
        this.colors.add(name);
    }
}
