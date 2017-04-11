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
    private ShowLinks _links;

    private ShowEmbed _embedded;

    public class ShowEmbed {
        private List<Cast> cast;
        private Episode previousepisode;
        private Episode nextepisode;
        private List<Episode> episodes;

        public List<Cast> getCast() {
            return cast;
        }

        public Episode getPreviousepisode() {
            return previousepisode;
        }

        public List<Episode> getEpisodes() {
            return episodes;
        }

        public Episode getNextepisode() {
            return nextepisode;
        }
    }

    public class ShowLinks extends Links {
        private Link self;
        private Link previousepisode;
        private Link nextepisode;

        public String getSelf() {
            if (self != null) {
                return self.getHref();
            }
            return null;
        }

        public String getPreviousEpisode() {
            if (previousepisode != null) {
                return previousepisode.getHref();
            }
            return null;
        }

        public String getNextEpisode() {
            if (nextepisode != null) {
                return nextepisode.getHref();
            }
            return null;
        }
    }

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

    public ShowLinks get_links() {
        return _links;
    }

    public ShowEmbed get_embedded() {
        return _embedded;
    }
}
