package tech.meteoriteliu.tvmazeclient;

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
}
