package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/design-underground-system/
 */
public class DesignUndergroundSystem {

    private final Map<Integer, Travel> records;
    private final Map<String, List<Integer>> routes;

    public DesignUndergroundSystem() {
        records = new HashMap<>();
        routes = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        records.put(id, new Travel(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        var travel = records.remove(id);
        var stationPair = travel.stationName + "#" + stationName;

        if (routes.get(stationPair) == null) {
            routes.put(stationPair, new ArrayList<>());
        }

        var list = routes.get(stationPair);
        list.add(t - travel.time);
        routes.put(stationPair, list);
    }

    public double getAverageTime(String startStation, String endStation) {

        return routes.get(startStation + "#" + endStation)
                .stream()
                .mapToDouble(i -> i)
                .average()
                .orElse(0);
    }

    class Travel {

        private final String stationName;
        private final int time;

        public Travel(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        var undergroundSystem = new DesignUndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);  // Customer 45 "Leyton" -> "Waterloo" in 15-3 = 12
        undergroundSystem.checkOut(27, "Waterloo", 20);  // Customer 27 "Leyton" -> "Waterloo" in 20-10 = 10
        undergroundSystem.checkOut(32, "Cambridge", 22); // Customer 32 "Paradise" -> "Cambridge" in 22-8 = 14
        System.out.println(undergroundSystem.getAverageTime("Paradise", "Cambridge")); // return 14.00000. One trip "Paradise" -> "Cambridge", (14) / 1 = 14
        undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 11.00000. Two trips "Leyton" -> "Waterloo", (10 + 12) / 2 = 11
        undergroundSystem.checkIn(10, "Leyton", 24);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));    // return 11.00000
        undergroundSystem.checkOut(10, "Waterloo", 38);  // Customer 10 "Leyton" -> "Waterloo" in 38-24 = 14
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));    // return 12.00000. Three trips "Leyton" -> "Waterloo", (10 + 12 + 14) / 3 = 12
    }
}
