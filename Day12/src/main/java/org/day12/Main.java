package org.day12;

import java.util.List;

public class Main {

    private static final boolean part2 = true;

    public static void main(String[] args) {
        char[][] input = processInput(Day12Input.input);
        long totalPrice = 0;
        for (int y = 0; y < input.length; y++) {
            char[] row = input[y];
            for (int x = 0; x < row.length; x++) {
                char flower = row[x];
                if (Character.isLowerCase(flower))
                    continue;
                RegionInfo regionInfo = new RegionInfo();
                explore(input, x, y, flower, regionInfo);
                System.out.println(flower + ": " + regionInfo.getPrice());
                totalPrice += regionInfo.getPrice();
            }
        }
        System.out.println("Price: " + totalPrice);
    }

    private static void explore(char[][] input, int x, int y, char flower, RegionInfo regionInfo) {
        if (!isSameFlower(input, x, y, flower, false))
            return;
        regionInfo.addArea(part2 ? countBorders2(input, x, y, flower) : countBorders(input, x, y, flower));
        input[y][x] = Character.toLowerCase(input[y][x]);
        explore(input, x + 1, y, flower, regionInfo);
        explore(input, x - 1, y, flower, regionInfo);
        explore(input, x, y + 1, flower, regionInfo);
        explore(input, x, y - 1, flower, regionInfo);
    }

    private static int countBorders(char[][] input, int x, int y, char flower) {
        int borders = 0;
        if (!isSameFlower(input, x - 1, y, flower, true)) borders++;
        if (!isSameFlower(input, x + 1, y, flower, true)) borders++;
        if (!isSameFlower(input, x, y + 1, flower, true)) borders++;
        if (!isSameFlower(input, x, y - 1, flower, true)) borders++;
        return borders;
    }

    private static int countBorders2(char[][] input, int x, int y, char flower) {
        int borders = 0;
        List<int[]> upperLeft = List.of(new int[]{x, y+1}, new int[]{x-1, y});
        List<int[]> upperRight = List.of(new int[]{x, y+1}, new int[]{x+1, y});
        List<int[]> lowerLeft = List.of(new int[]{x, y-1}, new int[]{x-1, y});
        List<int[]> lowerRight = List.of(new int[]{x, y-1}, new int[]{x+1, y});
        List<List<int[]>> possEdges = List.of(upperRight, upperLeft, lowerRight, lowerLeft);
        for (List<int[]> possEdge : possEdges) {
            if (twoDifferent(input, possEdge, new int[]{x, y}, flower))
                borders++;
        }

        List<int[]> upperLeftIn = List.of(new int[]{x, y}, new int[]{x, y+1}, new int[]{x-1, y});
        List<int[]> upperRightIn = List.of(new int[]{x, y}, new int[]{x, y+1}, new int[]{x+1, y});
        List<int[]> lowerLeftIn = List.of(new int[]{x, y}, new int[]{x, y-1}, new int[]{x-1, y});
        List<int[]> lowerRightIn = List.of(new int[]{x, y}, new int[]{x, y-1}, new int[]{x+1, y});
        if (threeSame(input, upperLeftIn, new int[]{x-1, y+1}, flower)) borders++;
        if (threeSame(input, upperRightIn, new int[]{x+1, y+1}, flower)) borders++;
        if (threeSame(input, lowerLeftIn, new int[]{x-1, y-1}, flower)) borders++;
        if (threeSame(input, lowerRightIn, new int[]{x+1, y-1}, flower)) borders++;
        return borders;
    }

    private static boolean threeSame(char[][] input, List<int[]> same, int[] different, char flower) {
        for (int[] ints : same) {
            if (!isSameFlower(input, ints[0], ints[1], flower, true))
                return false;
        }
        return !isSameFlower(input, different[0], different[1], flower, true);
    }

    private static boolean twoDifferent(char[][] input, List<int[]> different, int[] same, char flower) {
        for (int[] ints : different) {
            if (isSameFlower(input, ints[0], ints[1], flower, true))
                return false;
        }
        return isSameFlower(input, same[0], same[1], flower, true);
    }
    private static boolean isSameFlower(char[][] input, int x, int y, char flower, boolean ignoreCase) {
        if (y < 0 || y >= input.length)
            return false;
        char[] row = input[y];
        if (x < 0 || x >= row.length)
            return false;
        return ignoreCase ? Character.toUpperCase(row[x]) == Character.toUpperCase(flower) : row[x] == flower;
    }

    private static char[][] processInput(String input) {
        String[] lines = input.split("\n");
        char[][] rows = new char[lines.length][];
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            rows[i] = line.toCharArray();
        }
        return rows;
    }
}