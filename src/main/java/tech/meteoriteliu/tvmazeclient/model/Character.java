package tech.meteoriteliu.tvmazeclient.model;

/**
 * Created by meteo on 2017/4/11.
 */
public class Character {
    private int id;
    private String url;
    private String name;
    private Image image;
    private Links _links;

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public Image getImage() {
        return image;
    }

    public Links get_links() {
        return _links;
    }
}
