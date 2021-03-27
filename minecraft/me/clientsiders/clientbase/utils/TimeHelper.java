package me.clientsiders.clientbase.utils;

public class TimeHelper {
    //LAST TIME
    private long lastTime = getCurrentTime();

    //RESET
    public TimeHelper() {
        reset();
    }
    //GET CURRENT TIME
    public long getCurrentTime() {
        return System.nanoTime() / 1000000;
    }

    //GET LAST TIME
    public long getLastTime() {
        return lastTime;
    }

    //GET DIFFERENCE
    public long getDifference() {
        return getCurrentTime() - lastTime;
    }

    //RESET
    public void reset() {
        lastTime = getCurrentTime();
    }

    //HAS REACHED
    public boolean hasReached(long milliseconds) {
        return getDifference() >= milliseconds;
    }
}
