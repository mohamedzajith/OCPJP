package com.mohamed.Enumeration;

/**
 * Created by dba on 3/6/15.
 */
public enum details {
    mohamed("Anuradhapura","25"),
    miller("Colombo","26"),
    nimishan("Kandy","24");

    private final String area;
    private final String age;

    details(String place, String year) {
        area=place;
        age=year;
    }

    public String getAge() {
        return age;
    }

    public String getArea() {
        return area;
    }
}

