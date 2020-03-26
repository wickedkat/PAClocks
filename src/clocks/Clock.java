package clocks;

public abstract class Clock {

    private Time time;
    private int speed;
    private String sound;

    public Clock(int speed) throws Exception {
        if (speed == 0 || speed == (-1) || speed == 1 ){
            this.speed = speed;
            this.time = new Time();

        }
        else{
            throw new Exception("Incorrect speed, must be -1, 0 or 1");

        }
    }




    public void setTime(int hour, int min, int sec) throws Exception {
        if( hour < 0 || hour >23 || min <0 || min >59 || sec < 0 ||sec> 59){
            throw new Exception ("Illegal time value");
        }

        time.setTime(hour,min,sec);

    }

    public void setTime(Time time){
        this.time = time;
    }

    public Time getTime(){
        return time;
    }

    public void tick(){
        this.time.tick();
        if (time.getMin()==0 && time.getSec()==0){
            System.out.println(getSound());

        }

    }

    public void setSound(String sound){
        this.sound = sound;
    }

    public String getSound(){
        return sound;
    };

    public void printTime(Time time){
        System.out.println(time.getHour()+":"+time.getMin()+":"+time.getSec());
    }

    public int getSpeed() {
        return speed;
    }
}
