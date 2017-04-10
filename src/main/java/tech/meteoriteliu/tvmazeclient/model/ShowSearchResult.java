package tech.meteoriteliu.tvmazeclient.model;

import java.math.BigDecimal;

/**
 * Created by meteo on 2017/4/10.
 */
public class ShowSearchResult {
    private BigDecimal score;
    private Show show;

    public BigDecimal getScore() {
        return score;
    }

    public Show getShow() {
        return show;
    }
}
