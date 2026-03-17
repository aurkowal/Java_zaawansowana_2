package pl.coderslab.advanced.date;

import java.time.ZoneId;

public class Main01 {
    public static void main(String[] args) {
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            if (zoneId.startsWith("Europe")) {
                System.out.println(zoneId);
            }
        }
    }
}
