package clocks;

import java.util.ArrayList;
import java.util.List;

public class ClockShop {
    private List<Clock> allClocks;

    public ClockShop(){
        allClocks = new ArrayList<>();

    }

    public List<Clock> getAllClocks() {
        return allClocks;
    }

    public void addClock(Clock clock){
        allClocks.add(clock);
    }

    public void differenciateSpeed(){   /* not very elaborate way to make some clocks rush and some delay */
        for (Clock clock: allClocks
        ) {if(clock.getSpeed()==0){
            clock.tick();}
        else if (clock.getSpeed()==1){
            clock.tick();
            clock.tick();
        }

        }
    }
    public void tickAllClocks(){
        for (Clock clock: allClocks){
            clock.tick();
            if (clock instanceof AlarmClock){
                ((AlarmClock) clock).checkAlarm();
            }
        }
    }
    public void setAllClocks(int hour, int min, int sec) throws Exception {
        for (Clock clock:allClocks
        ) {clock.setTime(hour, min, sec);
        }
    }
}

