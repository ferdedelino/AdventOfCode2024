package org.day04;

import java.util.Arrays;
import java.util.function.Function;

public class Main {

    private static final boolean partTwo = true;
    private static final char endChar = '#';

    public static void main(String[] args) {
        if (partTwo)
            partTwo();
        else
            partOne();
    }

    private static void partOne() {
        char[][] input = parseInput(Day04Input.input);
        Function<Character, Character> nextCharGenerator = c -> {
          return switch (c) {
              case 'X' -> 'M';
              case 'M' -> 'A';
              case 'A' -> 'S';
              case 'S' -> '#';
              default -> {
                  throw new IllegalStateException("Unexpected value: " + c);
              }
          };
        };
        int sum = 0;
        for (int y = 0; y < input.length; y++) {
            for (int x = 0; x < input[y].length; x++) {
                if (input[y][x] != 'X')
                    continue;
                for (int dX = -1; dX <= 1; dX++) {
                    for (int dY = -1; dY <= 1; dY++) {
                        if (dX == dY && dX == 0)
                            continue;
                        if (isWord(input, x, y, dX, dY, nextCharGenerator.apply(input[y][x]), nextCharGenerator))
                            sum++;
                    }
                }
            }
        }
        System.out.println("Sum: " + sum);
    }

    private static void partTwo() {
        char[][] input = parseInput(Day04Input.input);
        int sum = 0;
        for (int y = 0; y < input.length; y++) {
            if (y == 0 || y == input.length - 1)
                continue;
            for (int x = 0; x < input[y].length; x++) {
                if (x == 0 || x == input[y].length - 1)
                    continue;
                if (input[y][x] != 'A')
                    continue;
                char lUpper = input[y - 1][x - 1];
                char rUpper = input[y - 1][x + 1];
                char lLower = input[y + 1][x - 1];
                char rLower = input[y + 1][x + 1];
                if (pairFitsPartTwo(lUpper, rLower) && pairFitsPartTwo(rUpper, lLower))
                    sum++;
            }
        }
        System.out.println("Sum: " + sum);
    }

    private static boolean pairFitsPartTwo(char c1, char c2) {
        if (c1 == 'M')
            return c2 == 'S';
        if (c1 == 'S')
            return c2 == 'M';
        return false;
    }

    private static boolean isWord(char[][] matrix, int x, int y, int dX, int dY, char nextChar, Function<Character, Character> nextCharGenerator) {
        if (x + dX < 0 || x + dX >= matrix[y].length)
            return false;
        if (y + dY < 0 || y + dY >= matrix.length)
            return false;
        if (matrix[y + dY][x + dX] != nextChar)
            return false;
        char c = nextCharGenerator.apply(nextChar);
        if (c == endChar)
            return true;
        return isWord(matrix, x + dX, y + dY, dX, dY, c, nextCharGenerator);
    }

    private static char[][] parseInput(String input) {
        String[] split = input.split("\n");
        char[][] matrix = new char[split.length][];
        for (int y = 0; y < split.length; y++) {
            matrix[y] = new char[split[y].length()];
            for (int x = 0; x < split[y].length(); x++) {
                matrix[y][x] = split[y].charAt(x);
            }
        }
        return matrix;
    }
}