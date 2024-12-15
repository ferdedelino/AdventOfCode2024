package org.day13;

import com.github.kiprobinson.bigfraction.BigFraction;
import org.apache.commons.lang3.math.Fraction;
import org.commons.EquationSolution;
import org.commons.LinearEquationSystem;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final boolean partTwo = true;

    public static void main(String[] args) {
        List<ClawMachine> clawMachines = processInput(Day13Input.content);
        long cost = 0;
        for (ClawMachine clawMachine : clawMachines) {
            LinearEquationSystem<BigFraction> system = clawMachine.generateEquationSystem();
            EquationSolution<BigFraction> equationSolution = system.generateSolution();
            if (!equationSolution.isSolvable()) {
                System.out.println("No solution found");
                continue;
            }
            System.out.println("Dimention: " + equationSolution.getSolutionDimention());
            List<BigFraction> specificSolution = equationSolution.getSpecificSolution();
            BigFraction a = specificSolution.get(0);
            BigFraction b = specificSolution.get(1);
            if (!a.getDenominator().equals(BigInteger.ONE) || !b.getDenominator().equals(BigInteger.ONE)) {
                System.out.println("Not whole number! " + a + ", " + b);
                continue;
            }
            cost += 3L * a.getNumerator().longValue() + 1L * b.getNumerator().longValue();
        }
        System.out.println("Total Cost: " + cost);
    }

    private static List<ClawMachine> processInput(String input) {
        List<ClawMachine> clawMachines = new ArrayList<>();
        String[] lines = input.split("\n");
        List<String> machine = new ArrayList<>();
        for (String line : lines) {
            if (line.trim().isEmpty()) {
                if (!machine.isEmpty()) {
                    clawMachines.add(deserializeClawMachine(machine));
                }
                machine.clear();
            } else {
                machine.add(line);
            }
        }
        if (!machine.isEmpty()) {
            clawMachines.add(deserializeClawMachine(machine));
        }
        return clawMachines;
    }



    private static ClawMachine deserializeClawMachine(List<String> input) {
        int aX, aY, bX, bY, priceX, priceY;

        Pattern pattern = Pattern.compile("[XY]\\+([0-9]+)");

        Matcher line0Matcher = pattern.matcher(input.get(0));
        line0Matcher.find();
        aX = Integer.parseInt(line0Matcher.group(1));
        line0Matcher.find();
        aY = Integer.parseInt(line0Matcher.group(1));

        Matcher line1Matcher = pattern.matcher(input.get(1));
        line1Matcher.find();
        bX = Integer.parseInt(line1Matcher.group(1));
        line1Matcher.find();
        bY = Integer.parseInt(line1Matcher.group(1));

        Matcher priceMatcher = Pattern.compile("[XY]=([0-9]+)").matcher(input.get(2));
        priceMatcher.find();
        priceX = Integer.parseInt(priceMatcher.group(1));
        priceMatcher.find();
        priceY = Integer.parseInt(priceMatcher.group(1));

        return new ClawMachine(aX, aY, bX, bY, 10000000000000L + priceX, 10000000000000L + priceY);
    }


}