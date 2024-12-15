package org.commons;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class EquationSolution<T extends Number> {

    private boolean solvable;
    private List<List<T>> kernelBasis;
    private List<T> specificSolution;
    private NumericOperations<T> numericOperations;

    public EquationSolution(boolean solvable, List<List<T>> kernelBasis, List<T> specificSolution, NumericOperations<T> numericOperations) {
        this.solvable = solvable;
        this.kernelBasis = kernelBasis;
        this.specificSolution = specificSolution;
        this.numericOperations = numericOperations;
    }

    public int getSolutionDimention() {
        if (!isSolvable())
            return -1;
        return kernelBasis.size();
    }

    @Override
    public String toString() {
        return "EquationSolution{" +
                "\nsolvable=" + solvable +
                "\nkernelBasis=\n" + kernelBasis.stream().map(List::toString).collect(Collectors.joining("\n")) +
                "\nspecialSolution=" + specificSolution +
                "\n}";
    }
}
