package me.clientsiders.clientbase.utils;

public class TimeHelper {
    //Last Time
    private long lastTime = getCurrentTime();

    //Reset the counter
    public TimeHelper() {
        reset();
    }
    //Get the current time
    public long getCurrentTime() {
        return System.nanoTime() / 1000000;
    }

    //Get the last time
    public long getLastTime() {
        return lastTime;
    }

    //Get difference
    public long getDifference() {
        return getCurrentTime() - lastTime;
    }

    //Resets the Counter
    public void reset() {
        lastTime = getCurrentTime();
    }

    //Time Counter
    public boolean hasReached(long milliseconds) {
        return getDifference() >= milliseconds;
    }
}
