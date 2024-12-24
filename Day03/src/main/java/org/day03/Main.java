package org.day03;

import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final boolean partTwo = true;

    public static void main(String[] args) {
        if (partTwo)
            partTwo();
        else
            partOne();
    }

    private static void partOne() {
        long sum = 0;
        Pattern digitRegex = Pattern.compile("mul\\(([0-9]+),([0-9]+)\\)");
        Matcher matcher = digitRegex.matcher(Day03Input.input);
        while (matcher.find()) {
            sum += Long.parseLong(matcher.group(1)) * Long.parseLong(matcher.group(2));
        }
        System.out.println("Sum: " + sum);
    }

    private static void partTwo() {
        long sum = 0;
        Pattern digitRegex = Pattern.compile("mul\\(([0-9]+),([0-9]+)\\)");
        Pattern doRegex = Pattern.compile("do\\(\\)");
        Pattern dontRegex = Pattern.compile("don't\\(\\)");

        TreeMap<Integer, Boolean> allowedTreeMap = new TreeMap<>();
        allowedTreeMap.put(0, true);

        Matcher doMatcher = doRegex.matcher(Day03Input.input);
        Matcher dontMatcher = dontRegex.matcher(Day03Input.input);
        while (doMatcher.find()) {
            allowedTreeMap.put(doMatcher.start(), true);
        }
        while (dontMatcher.find()) {
            allowedTreeMap.put(dontMatcher.start(), false);
        }

        Matcher matcher = digitRegex.matcher(Day03Input.input);
        while (matcher.find()) {
            if (allowedTreeMap.floorEntry(matcher.start()).getValue())
                sum += Long.parseLong(matcher.group(1)) * Long.parseLong(matcher.group(2));
        }
        System.out.println("Sum: " + sum);
    }
}