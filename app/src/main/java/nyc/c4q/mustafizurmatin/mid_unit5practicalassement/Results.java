package nyc.c4q.mustafizurmatin.mid_unit5practicalassement;

/**
 * Created by c4q on 1/24/18.
 */


class Results {
    private String name;
    private String title;
    private String first;
    private String last;
    private String picture;

    public Results(String name, String title, String first, String last, String picture) {
        this.name = name;
        this.title = title;
        this.first = first;
        this.last = last;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getPicture() {
        return picture;
    }
}
