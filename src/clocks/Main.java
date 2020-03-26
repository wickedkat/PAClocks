package clocks;

public class Main {
    public static void main(String[] args) throws Exception {

        ClockShop shop = new ClockShop();
        WallClock wallClock = new WallClock(0);
        WallClock wallClock2 = new WallClock(-1);
        Watch watch = new Watch(1);
        AlarmClock alarmClock = new AlarmClock(0);
        BigBen BigBen = clocks.BigBen.getInstance();

        shop.addClock(wallClock);
        shop.addClock(wallClock2);
        shop.addClock(watch);
        shop.addClock(alarmClock);
        shop.addClock(BigBen);

        shop.setAllClocks(18, 40, 56);
        for (Clock clock:shop.getAllClocks()
        ) {clock.printTime(clock.getTime());

        }
        System.out.println("");
        alarmClock.setAlarmTime(18,45,0);
        alarmClock.printTimeLeftToSleep();
        shop.differenciateSpeed();
        for (int i = 0; i < 1200; i++) {
            shop.tickAllClocks();
        }
        for (Clock clock:shop.getAllClocks()
             ) {clock.printTime(clock.getTime());

        }
        System.out.println("");



    }
}