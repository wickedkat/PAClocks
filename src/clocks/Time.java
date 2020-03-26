package clocks;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time() {
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    public Time(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }



    public void setTime(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }


    public int[] getTime(){
        return new int[] {hour,min,sec};

    }

    public void tick(){
        if(sec <59){
            sec+=1;
        }
        else{
            sec = 0;
            if (min <59){
                min+=1;
            }
            else{
                min =0;
                if(hour< 23){
                    hour +=1;

                }
                else{
                    hour =0;
                }
            }
        }
    }
}
