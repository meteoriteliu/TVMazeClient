package tech.meteoriteliu.tvmazeclient.model;

import java.util.Date;
import java.util.List;

/**
 * Created by meteo on 2017/4/10.
 */
public class Show {
    private int id;
    private String url;
    private String name;
    private String type;
    private String language;
    private List<String> genres;
    private String status;
    private Integer runtime;
    private Date premiered;
    private Schedule schedule;
    private Rating rating;
    private Integer weight;
    private WebChannel webChannel;
    private Network network;
    private Externals externals;
    private Image image;
    private String summary;
    private long updated;
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

    public String getType() {
        return type;
    }

    public String getLanguage() {
        return language;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getStatus() {
        return status;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Date getPremiered() {
        return premiered;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public Rating getRating() {
        return rating;
    }

    public Integer getWeight() {
        return weight;
    }

    public WebChannel getWebChannel() {
        return webChannel;
    }

    public Network getNetwork() {
        return network;
    }

    public Externals getExternals() {
        return externals;
    }

    public Image getImage() {
        return image;
    }

    public String getSummary() {
        return summary;
    }

    public long getUpdated() {
        return updated;
    }

    public Links get_links() {
        return _links;
    }
}
