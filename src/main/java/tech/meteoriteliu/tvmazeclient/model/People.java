package tech.meteoriteliu.tvmazeclient.model;

import java.util.List;

/**
 * Created by meteo on 2017/4/11.
 */
public class People {
    private int id;
    private String url;
    private String name;
    private Image image;
    private PeopleLinks _links;
    private PeopleEmbed _embedded;

    public class PeopleEmbed {
        private List<CastCredit> castcredits;

        public List<CastCredit> getCastcredits() {
            return castcredits;
        }
    }

    public class PeopleLinks extends Links {
        private Link self;

        public String getSelf() {
            if (self != null) {
                return self.getHref();
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

    public Image getImage() {
        return image;
    }

    public PeopleLinks get_links() {
        return _links;
    }

    public PeopleEmbed get_embedded() {
        return _embedded;
    }
}
