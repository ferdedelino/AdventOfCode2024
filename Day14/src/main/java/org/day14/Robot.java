package org.day14;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Robot {

    private RobotRoom room;

    private long x;
    private long y;

    private long dx;
    private long dy;

    public void move(long steps) {
        long xEnd = x + (steps * dx);
        long yEnd = y + (steps * dy);

        x = ((xEnd % room.with()) + room.with()) % room.with();
        y = ((yEnd % room.height()) + room.height()) % room.height();
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
