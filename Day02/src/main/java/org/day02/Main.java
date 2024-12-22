package org.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final boolean partTwo = true;

    public static void main(String[] args) {
        List<List<Integer>> reports = new ArrayList<>();
        for (String string : Day02Input.input.split("\n")) {
            if (string.isBlank())
                continue;
            List<Integer> report = new ArrayList<>();
            Pattern digitRegex = Pattern.compile("-?[0-9]+");
            Matcher matcher = digitRegex.matcher(string);
            while (matcher.find()) {
                report.add(Integer.parseInt(matcher.group()));
            }
            reports.add(report);
        }
        System.out.println("Save Reports: " + countSaveReports(reports));
    }

    private static int countSaveReports(List<List<Integer>> reports) {
        int count = 0;
        for (List<Integer> report : reports) {
            if (!partTwo && isReportSave(report))
                count++;
            if (partTwo && inefficientIsReportSave2(report))
                count++;
        }
        return count;
    }

    private static boolean isReportSave(List<Integer> report) {
        if (report.isEmpty())
            return false;
        int last = report.get(0);
        if (report.size() == 1) {
            return true;
        }
        boolean increasing = report.get(1) - report.get(0) > 0;
        for (int i = 1; i < report.size(); i++) {
            int diff = report.get(i) - last;
            if (increasing != (diff > 0))
                return false;
            if (Math.abs(diff) < 1 || Math.abs(diff) > 3)
                return false;
            last = report.get(i);
        }
        return true;
    }

    private static boolean inefficientIsReportSave2(List<Integer> report) {
        if (report.isEmpty())
            return false;
        if (report.size() <= 2) // remove one will always work
            return true;

        for (int i = -1; i < report.size(); i++) {
            if (inefficientIsReportSave2(report, i))
                return true;
        }
        return false;
    }

    private static boolean inefficientIsReportSave2(List<Integer> report, int ignoreIndex) {
        int firstIndex = ignoreIndex == 0 ? 1 : 0;
        Integer last = report.get(firstIndex);
        Boolean increasing = null;
        for (int i = 0; i < report.size(); i++) {
            if (i == ignoreIndex || i == firstIndex)
                continue;
            if (increasing == null)
                increasing = report.get(i) - last > 0;

            int diff = report.get(i) - last;
            if (increasing != (diff > 0))
                return false;
            if (Math.abs(diff) < 1 || Math.abs(diff) > 3)
                return false;
            last = report.get(i);
        }
        return true;
    }
}