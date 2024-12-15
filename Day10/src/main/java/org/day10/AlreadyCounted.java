package org.day10;

import java.util.HashSet;
import java.util.Set;

public class AlreadyCounted {
    private Set<Integer> found = new HashSet<>();

    public void add(int x, int y, int[][] ints) {
        found.add(y * ints[0].length + x);
    }

    public int size() {
        return found.size();
    }
}
