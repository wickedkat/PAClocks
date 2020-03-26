package clocks;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    @org.junit.jupiter.api.Test
    void tick() throws Exception {
        WallClock wallClock = new WallClock(0);
        wallClock.setTime(12, 0, 0);
        wallClock.tick();
        Time wallclockTime = wallClock.getTime();
        assertEquals(1, wallclockTime.getSec());
        assertEquals(0, wallclockTime.getMin());
        assertEquals(12, wallclockTime.getHour());

        wallClock.setTime(12, 59, 59);
        for (int i = 0; i < 63; i++) {
            wallClock.tick();}
            assertEquals(2, wallclockTime.getSec());
            assertEquals(1, wallclockTime.getMin());
            assertEquals(13, wallclockTime.getHour());
        }

    }
