package tech.meteoriteliu.tvmazeclient.model;

import java.math.BigDecimal;

/**
 * Created by meteo on 2017/4/11.
 */
public class PeopleSearchResult {
    private BigDecimal score;
    private People person;

    public BigDecimal getScore() {
        return score;
    }

    public People getPerson() {
        return person;
    }
}
