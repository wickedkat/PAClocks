package clocks;

public class BigBen extends Clock {

    private static BigBen instance;

    private BigBen(int speed) throws Exception {
        super(speed);
        setSound("Big Ben");
    }

    public static BigBen getInstance() throws Exception {
        if(instance == null){
            instance = new BigBen(0);  /* Big Ben wont rush or go late!*/
        }
        return instance;
    }


}
