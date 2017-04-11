package tech.meteoriteliu.tvmazeclient.model;

/**
 * Created by meteo on 2017/4/11.
 */
public class Season {
    private int id;
    private String url;
    private Integer number;
    private String name;
    private Integer episodeOrder;
    private String premiereDate;
    private String endDate;
    private Network network;
    private WebChannel webChannel;
    private Image image;
    private String summary;
    private Links _links;

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Integer getEpisodeOrder() {
        return episodeOrder;
    }

    public String getPremiereDate() {
        return premiereDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public Network getNetwork() {
        return network;
    }

    public WebChannel getWebChannel() {
        return webChannel;
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
}
