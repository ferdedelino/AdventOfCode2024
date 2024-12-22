package org.day01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final boolean partTwo = true;

    public static void main(String[] args) {
        Pattern digitRegex = Pattern.compile("-?[0-9]+");
        Matcher matcher = digitRegex.matcher(Day01Input.input);
        List<Long> numbersLeft = new ArrayList<>();
        List<Long> numbersRight = new ArrayList<>();
        boolean left = true;
        while (matcher.find()) {
            if (left)
                numbersLeft.add(Long.parseLong(matcher.group()));
            else
                numbersRight.add(Long.parseLong(matcher.group()));
            left ^= true;
        }
        if (partTwo)
            System.out.println("Distance: " + calcSimilarity(numbersLeft, numbersRight));
        else
            System.out.println("Distance: " + calcDistance(numbersLeft, numbersRight));
    }

    private static long calcDistance(List<Long> left, List<Long> right) {
        Collections.sort(left);
        Collections.sort(right);
        long distance = 0;
        for (int i = 0; i < left.size(); i++) {
            distance += Math.abs(left.get(i) - right.get(i));
        }
        return distance;
    }

    private static final long calcSimilarity(List<Long> left, List<Long> right) {
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < right.size(); i++) {
            map.put(right.get(i), map.getOrDefault(right.get(i), 0) + 1);
        }
        long similarity = 0;
        for (int i = 0; i < left.size(); i++) {
            similarity += left.get(i) * map.getOrDefault(left.get(i), 0);
        }
        return similarity;
    }
}