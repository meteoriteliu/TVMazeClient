package tech.meteoriteliu.tvmazeclient.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by meteo on 2017/4/10.
 */
public class Schedule {
    private String time;
    private List<String> days;

    public String getTime() {
        return time;
    }

    public List<String> getDays() {
        return days;
    }

    public List<Integer> getDaysAsInt() {
        if (days == null) return null;
        List<Integer> list = new ArrayList<Integer>();
        for (String s : days) {
            if ("monday".equalsIgnoreCase(s)) {
                list.add(Calendar.MONDAY);
            }
            if ("tuesday".equalsIgnoreCase(s)) {
                list.add(Calendar.THURSDAY);
            }
            if ("wednesday".equalsIgnoreCase(s)) {
                list.add(Calendar.WEDNESDAY);
            }
            if ("thursday".equalsIgnoreCase(s)) {
                list.add(Calendar.THURSDAY);
            }
            if ("friday".equalsIgnoreCase(s)) {
                list.add(Calendar.FRIDAY);
            }
            if ("saturday".equalsIgnoreCase(s)) {
                list.add(Calendar.SATURDAY);
            }
            if ("sunday".equalsIgnoreCase(s)) {
                list.add(Calendar.SUNDAY);
            }
        }
        return list;
    }
}
