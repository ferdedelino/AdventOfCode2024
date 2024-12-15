package org.day14;

import java.util.*;
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
        RobotRoom room = new RobotRoom(101, 103);
        long uL = 0, uR = 0, dL = 0, dR = 0;
        for (String string : Day14Input.input.split("\n")) {
            if (string.isEmpty())
                continue;
            Pattern digitRegex = Pattern.compile("-?[0-9]+");
            Matcher matcher = digitRegex.matcher(string);
            List<Integer> numbers = new ArrayList<>();
            while (matcher.find()) {
                numbers.add(Integer.parseInt(matcher.group()));
            }
            Robot robot = new Robot(room, numbers.get(0), numbers.get(1), numbers.get(2), numbers.get(3));
            robot.move(100);
            if (robot.getX() < (room.with() - 1) / 2) {
                if (robot.getY() < (room.height() - 1) / 2) uL++;
                if (robot.getY() > (room.height() - 1) / 2) dL++;
            } else if (robot.getX() > (room.with() - 1) / 2) {
                if (robot.getY() < (room.height() - 1) / 2) uR++;
                if (robot.getY() > (room.height() - 1) / 2) dR++;
            }
        }
        long solution = uL * uR * dL * dR;
        System.out.println("Solution: " + solution);
    }

    private static void partTwo() {
        List<Robot> robots = new ArrayList<>();
        RobotRoom room = new RobotRoom(101, 103);

        for (String string : Day14Input.input.split("\n")) {
            if (string.isEmpty())
                continue;
            Pattern digitRegex = Pattern.compile("-?[0-9]+");
            Matcher matcher = digitRegex.matcher(string);
            List<Integer> numbers = new ArrayList<>();
            while (matcher.find()) {
                numbers.add(Integer.parseInt(matcher.group()));
            }
            Robot robot = new Robot(room, numbers.get(0), numbers.get(1), numbers.get(2), numbers.get(3));
            robots.add(robot);
        }

        int step = 0;
        while (true) {
            step++;
            robots.forEach(robot -> robot.move(1));
            System.out.println("Current Step: " + step);
            if (printCanvas(room, robots, step)) {
                return;
            }
        }

    }

    private static boolean printCanvas(RobotRoom room, List<Robot> robots, int step) {
        Map<Long, Integer> canvas = new HashMap<>();
        for (Robot robot : robots) {
            long key = robot.getX() + robot.getY() * room.with();
            canvas.put(key, 1);
        }

        boolean reached16 = false;
        for (int y = 0; y < room.height(); y++) {
            StringBuilder stringBuilder = new StringBuilder();
            int inRow = 0;
            for (int x = 0; x < room.with(); x++) {
                if (canvas.containsKey(x + y * room.with())) {
                    inRow++;
                    if (inRow >= 16)
                        reached16 = true;
                    stringBuilder.append("o");
                } else {
                    inRow = 0;
                    stringBuilder.append(".");
                }
            }
            if (reached16) {
                System.out.println(stringBuilder.toString());
            }
        }
        return reached16;
    }
}