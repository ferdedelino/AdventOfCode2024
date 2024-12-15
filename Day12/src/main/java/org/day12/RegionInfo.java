package org.day12;

public class RegionInfo {

    private int areas = 0;
    private int borders = 0;

    public void addArea(int borders) {
        this.areas++;
        this.borders += borders;
    }

    public long getPrice() {
        return (long) areas * (long) borders;
    }
}
