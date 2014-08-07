package org.jboss.examples.deltaspike.tickets.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Named;

@Named
public class Utils {

    public Utils() {
    }

    public String formatDate(Date date) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return formater.format(date);
    }

    public List<String> getAllBusSeats() {
        List<String> allSeats = new ArrayList<String>();

        for (int i = 0; i < 12; i++) {
            for (String s : new String[] { "A", "B", "C", "D" }) {
                allSeats.add((i + 1) + s);
            }
        }
        allSeats.remove("8C");
        allSeats.remove("8D");

        return allSeats;
    }

}
