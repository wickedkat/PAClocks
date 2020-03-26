package clocks;


import java.util.ArrayList;
import java.util.List;

public class Watch extends Clock {
    private final String color;

    public Watch( int speed) throws Exception {
        super(speed);
        setSound("Tick Tock");
        this.color = setColor();

    }

    public String setColor(){
        String [] colorlist = new String []{"black", "blue", "red", "purple", "green", "white"};
        return colorlist[(int) Math.floor((Math.random() * colorlist.length))];



    }

    public String getColor() {
        return color;
    }
}
