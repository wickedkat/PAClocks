package clocks;

public class AlarmClock extends Clock {
    private Time alarmTime;
    private boolean alarmOn;

    public AlarmClock(int speed) throws Exception {
        super(speed);
        this.alarmOn = false;
        this.alarmTime = new Time();
        setSound("Buzz");
    }


    public void setAlarmOn(boolean alarmOn) {
        this.alarmOn = alarmOn;
    }

    public void checkAlarm(){
        if(alarmTime.getHour()== getTime().getHour() && alarmTime.getMin()==getTime().getMin() && alarmTime.getSec()==getTime().getSec()){
            makeAlarm();
            setAlarmOn(false);
        }
    }

    public void makeAlarm(){
        System.out.println(getSound());
        System.out.println(getSound());
        printTime(getTime());
        System.out.println("");
    }

    public Time howMuchMoreCanISleep(){
        Time timeLeft = new Time();
        int alarmInSeconds = alarmTime.getSec() + ((alarmTime.getMin() + alarmTime.getHour()*60)*60);
        int currentTimeinSeconds = getTime().getSec() + ((getTime().getMin() + getTime().getHour()*60)*60);
        int allSecondsLeft = alarmInSeconds - currentTimeinSeconds;
        int hoursLeft = (int)Math.floor(allSecondsLeft/3600);
        allSecondsLeft -= hoursLeft*3600;
        int minutesLeft = (int)Math.floor(allSecondsLeft/60);
        int secondsLeft = allSecondsLeft - minutesLeft*60;
        timeLeft.setTime(hoursLeft, minutesLeft, secondsLeft);

        return timeLeft;


    }

    public void setAlarmTime(int hour, int min, int sec) throws Exception {
        alarmTime.setTime(hour, min,sec);
        setAlarmOn(true);
    }

    public void printTimeLeftToSleep(){
        System.out.println("Time left to sleep");

        printTime(howMuchMoreCanISleep());
    }
}
