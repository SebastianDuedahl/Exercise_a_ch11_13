package Chapter_11_a_13;
/*
Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if
no two keys map to the same value (and false if any two or more keys do map to the same value). For example, if
the map contains the following key/value pairs, your method would return true: {Marty=Stepp, Stuart=Reges,
Jessica=Miller, Amanda=Camp, Hal=Perkins}. But calling it on the following map would return false,
because of two mappings for Perkins and Reges: {Kendrick=Perkins, Stuart=Reges, Jessica=Miller,
Bruce=Reges, Hal=Perkins}.
 */

import java.util.*;
public class Exercise_13
{
    public static void main(String[] args)
    {
        Map<String, String> tMap = new HashMap<>();
        tMap.put("Marty", "Stepp");
        tMap.put("Stuart", "Reges");
        tMap.put("Jessica", "Miller");
        tMap.put("Amanda", "Camp");
        tMap.put("Hal", "Perkins");

        Map<String, String> fMap = new HashMap<>();
        fMap.put("Kendrick", "Perkin");
        fMap.put("Stuart", "Reges");
        fMap.put("Jessica", "Miller");
        fMap.put("Bruce", "Reges");
        fMap.put("Hal", "Perkins");

        System.out.println(isUniqe(tMap));

    }

    public static boolean isUniqe(Map<String, String> map) {
        HashSet<String> set = new HashSet<>();

        for (Map.Entry<String, String> m : map.entrySet()) {
            if (set.contains(m.getValue())) {
                return false;
            } else {
                set.add(m.getValue());
            }
        }
        return true;
    }
}
