package tech.meteoriteliu.tvmazeclient.model;

/**
 * Created by meteo on 2017/4/11.
 */
public class Episode {
    private int id;
    private String url;
    private String name;
    private Integer season;
    private Integer number;
    private String airdate;
    private String airtime;
    private String airstamp;
    private Integer runtime;
    private Image image;
    private String summary;
    private Links _links;
    private Show show;

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public Integer getSeason() {
        return season;
    }

    public Integer getNumber() {
        return number;
    }

    public String getAirdate() {
        return airdate;
    }

    public String getAirtime() {
        return airtime;
    }

    public String getAirstamp() {
        return airstamp;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Image getImage() {
        return image;
    }

    public String getSummary() {
        return summary;
    }

    public Links get_links() {
        return _links;
    }

    public Show getShow() {
        return show;
    }
}
