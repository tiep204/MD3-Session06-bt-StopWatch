package ra;

import java.util.Date;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
        endTime = startTime;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
}
