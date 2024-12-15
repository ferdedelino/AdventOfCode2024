package org.day10;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        int[][] ints = processInput(ProblemInput.topMap);
        AtomicInteger total = new AtomicInteger();

        for (int y = 0; y < ints.length; y++) {
            for (int x = 0; x < ints[y].length; x++) {
                if (getValIf(ints, x , y) == 0) {
                    AlreadyCounted alreadyCounted = new AlreadyCounted();
                    search(ints, x, y, 0, alreadyCounted);
                    total.addAndGet(alreadyCounted.size());
                }
            }
        }
        System.out.println("Result: " + total.get());
    }

    private static void search(int[][] ints, int x, int y, int currentNumber, AlreadyCounted alreadyFound) {
        if (currentNumber == 9) {
            if (getValIf(ints, x, y) == 9) {
                alreadyFound.add(x, y, ints);
            }
            return;
        }

        int nextNumber = currentNumber + 1;
        if (getValIf(ints, x + 1, y) == nextNumber)
            search(ints, x + 1, y, nextNumber, alreadyFound);
        if (getValIf(ints, x - 1, y) == nextNumber)
            search(ints, x - 1, y, nextNumber, alreadyFound);
        if (getValIf(ints, x, y + 1) == nextNumber)
            search(ints, x, y + 1, nextNumber, alreadyFound);
        if (getValIf(ints, x, y - 1) == nextNumber)
            search(ints, x, y - 1, nextNumber, alreadyFound);
    }

    private static int getValIf(int[][] ints, int x, int y) {
        if (y < 0 || y >= ints.length)
            return -1;
        int[] row = ints[y];
        if (x < 0 || x >= row.length)
            return -1;
        return row[x];
    }

    private static int[][] processInput(String input) {
        String[] split = input.split("\n");
        int[][] processed = new int[split.length][];
        for (int y = 0; y < split.length; y++) {
            String s = split[y].strip();
            int[] row = new int[s.length()];
            char[] charArray = s.toCharArray();
            for (int x = 0; x < charArray.length; x++) {
                row[x] = Integer.parseInt(String.valueOf(charArray[x]));
            }
            processed[y] = row;
        }
        return processed;
    }
}