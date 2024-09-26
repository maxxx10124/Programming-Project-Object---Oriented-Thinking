public class Time {
    //Fields declaration
    private int hour,minute,second = 0;
    //helper method
    private void millisConvert(long milli){
        milli %= 86400000;
        hour = (int)milli/3600000;
        milli %= 3600000;
        minute = (int)milli/60000;
        milli %= 60000;
        second = (int)milli/1000;
    }
    //Constructors
    public Time(){
        millisConvert(System.currentTimeMillis());
    }
    public Time(long millis){
        millisConvert(millis);
    }
    public Time(int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }

    //getter methods
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }   

    //other methods
    public void setTime(long elapsedTime){
        millisConvert(elapsedTime);
    }
    public String toString(){
        return hour + ":" + minute + ":" + second;
    }
}
