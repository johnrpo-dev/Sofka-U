public class Cancion {
    private int id;
    private String title;
    private int[] duration;
    private String gender;
    private String description;
    private String cover;

    public Cancion(String title,String gender) {
        this.id ++ ;
        this.title = title;
        this.gender = gender;
    }

    public void setDuration(int hours, int minutes, int seconds) {
        this.duration = duration{hours,minutes,seconds};
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int[] getDuration() {
        return duration;
    }

    public String getGender() {
        return gender;
    }

    public String getDescription() {
        return description;
    }

    public String getCover() {
        return cover;
    }
}
