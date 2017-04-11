package tech.meteoriteliu.tvmazeclient;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by meteo on 2017/4/10.
 */
public class Constants {
    public static final int RESOURCETYPE_SHOW = 1;

    public static String getResourceName(int resourceType) {
        switch (resourceType) {
            case RESOURCETYPE_SHOW:
                return "show";
            default:
                return "";
        }
    }

    public static final String EXTERNAL_TVRAGE = "tvrage";
    public static final String EXTERNAL_THETVDB = "thetvdb";
    public static final String EXTERNAL_IMDB = "imdb";

    private static final String DATEFORMAT = "yyyy-MM-dd";
    private static SimpleDateFormat sdf = new SimpleDateFormat(DATEFORMAT);
    static String formatDate(Date date) {
        return sdf.format(date);
    }

    public enum ShowEmbedItem {
        PREVIOUS_EPISODE("previousepisode"), NEXT_EPISODE("nextepisode"), CAST("cast"), EPISODES("episodes");

        private String value;
        ShowEmbedItem(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    public enum PeopleEmbedItem {
        CASTCREDITS("castcredits");

        private String value;
        PeopleEmbedItem(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}
