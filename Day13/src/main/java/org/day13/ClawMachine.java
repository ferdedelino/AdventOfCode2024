package org.day13;

import com.github.kiprobinson.bigfraction.BigFraction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.commons.LinearEquationSystem;
import org.commons.Matrix;

@AllArgsConstructor
@Getter
public class ClawMachine {

    int aX;
    int aY;
    int bX;
    int bY;
    long priceX;
    long priceY;

    public LinearEquationSystem<BigFraction> generateEquationSystem() {
        BigFraction[][] m = new BigFraction[2][];
        m[0] = new BigFraction[]{BigFraction.valueOf(aX, 1), BigFraction.valueOf(bX, 1)};
        m[1] = new BigFraction[]{BigFraction.valueOf(aY, 1), BigFraction.valueOf(bY, 1)};
        BigFraction[][] target = new BigFraction[2][];
        target[0] = new BigFraction[]{BigFraction.valueOf(priceX, 1)};
        target[1] = new BigFraction[]{BigFraction.valueOf(priceY, 1)};
        return new LinearEquationSystem<>(new Matrix<>(m, BigFraction.class), new Matrix<>(target, BigFraction.class));
    }

    @Override
    public String toString() {
        return "ClawMachine{" +
                "aX=" + aX +
                ", aY=" + aY +
                ", bX=" + bX +
                ", bY=" + bY +
                ", priceX=" + priceX +
                ", priceY=" + priceY +
                '}';
    }
}
