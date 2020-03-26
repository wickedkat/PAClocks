package clocks;

public class WallClock extends Clock {

    public WallClock(int speed) throws Exception {
        super(speed);
        setSound("Cuckoo");
    }
}
