package tech.meteoriteliu.tvmazeclient.model;

/**
 * Created by meteo on 2017/4/10.
 */
public class Links {

    private Self self;
    private PreviousEpisode previousepisode;

    private class Self {
        private String href;
    }

    private class PreviousEpisode {
        private String href;
    }

    public String getSelf() {
        if (self != null) {
            return self.href;
        }
        return null;
    }

    public String getPreviousEpisode() {
        if (previousepisode != null) {
            return previousepisode.href;
        }
        return null;
    }
}
