package org.example;

import org.apache.commons.lang3.math.Fraction;

import java.util.HashMap;
import java.util.Map;

public abstract class NumericOperations<T extends Number> {
    private static Map<Class<?>, NumericOperations<?>> operationsMap = new HashMap<>();
    static {
        operationsMap.put(Double.class, createDouble());
        operationsMap.put(Fraction.class, createFraction());
    }

    public abstract T multiply(T x, T y);
    public abstract T add(T x, T y);
    public abstract T negate(T x);
    public abstract T invert(T x);
    public abstract T one();
    public abstract boolean isZero(T x);

    public static <B extends Number> NumericOperations<B> byClass(Class<B> clazz) {
        NumericOperations<? extends Number> numericOperations = operationsMap.get(clazz);
        if (numericOperations == null)
            throw new UnsupportedOperationException("Numeric Operations for class " + clazz.getName() + " are not implemented");
        return (NumericOperations<B>) numericOperations;
    }

    private static NumericOperations<Double> createDouble() {
        return new NumericOperations<Double>() {
            @Override
            public Double multiply(Double x, Double y) {
                return x * y;
            }

            @Override
            public Double add(Double x, Double y) {
                return x + y;
            }

            @Override
            public Double negate(Double x) {
                return -x;
            }

            @Override
            public Double invert(Double x) {
                return 1D/x;
            }

            @Override
            public Double one() {
                return 1D;
            }

            @Override
            public boolean isZero(Double x) {
                return Math.abs(x) < 0.0001;
            }
        };
    }

    private static NumericOperations<Fraction> createFraction() {
        return new NumericOperations<Fraction>() {
            @Override
            public Fraction multiply(Fraction x, Fraction y) {
                return x.multiplyBy(y);
            }

            @Override
            public Fraction add(Fraction x, Fraction y) {
                return x.add(y);
            }

            @Override
            public Fraction negate(Fraction x) {
                return x.negate();
            }

            @Override
            public Fraction invert(Fraction x) {
                return x.invert();
            }

            @Override
            public Fraction one() {
                return Fraction.ONE;
            }

            @Override
            public boolean isZero(Fraction x) {
                return x.getNumerator() == 0;
            }
        };
    }
}
